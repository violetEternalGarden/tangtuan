(function (w) {
    // 手机号验证
    w.mobiles=function(mobile) {
        var ipone=/^0{0,1}(13[0-9]|15[7-9]|153|156|18[7-9])[0-9]{8}$/
        if(mobile==""){
            return "电话号码不能为空"
        }else if(!ipone.test(mobile)){
            return "手机号填写有误"
        }else{
            return true
        }
    }
    // 车架号验证
    w.vinNo=function(vinNo) {
        var vinNoz= /^[a-zA-Z0-9]{17}$/
        if(vinNo==""){
            return "车架号不能为空"
        }else if(!vinNoz.test(vinNo)){
            return "车架号填写有误"
        }else{
            return true
        }
    }

    //车牌正则
    w.carPai=function (carpai) {
        var carZ=/^[\u4E00-\u9FA5][\da-zA-Z]{6}$/
        if(carpai==""){
            return "车牌不能为空"
        }else if(!carZ.test(carpai)){
            return "车牌填写有误"
        }else{
            return true
        }
    }
    // 身份证
    w.scCard=function(scCard){
        if(scCard.length!=0){
            if(!checkCard(scCard)){
                return "身份证号码格式错误"
            }else{
                return true
            }
        }else {
            return "身份证不能为空"
        }
    }
    var vcity={ 11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",
        21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",
        33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",
        42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",
        51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",
        63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"
    };
    checkCard = function(obj) {
        //校验长度，类型
        if(isCardNo(obj) === false)
        {
            return false;
        }
        //检查省份
        if(checkProvince(obj) === false)
        {
            return false;
        }
        //校验生日
        if(checkBirthday(obj) === false)
        {
            return false;
        }
        //检验位的检测
        if(checkParity(obj) === false)
        {
            return false;
        }
        return true;
    };
    //检查号码是否符合规范，包括长度，类型
    isCardNo = function(obj)
    {
        //身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X
        var reg = /(^\d{15}$)|(^\d{17}(\d|X)$)/;
        if(reg.test(obj) === false)
        {
            return false;
        }
        return true;
    };
    //取身份证前两位,校验省份
    checkProvince = function(obj)
    {
        var province = obj.substr(0,2);
        if(vcity[province] == undefined)
        {
            return false;
        }
        return true;
    };
    //检查生日是否正确
    checkBirthday = function(obj)
    {
        var len = obj.length;
        //身份证15位时，次序为省（3位）市（3位）年（2位）月（2位）日（2位）校验位（3位），皆为数字
        if(len == '15')
        {
            var re_fifteen = /^(\d{6})(\d{2})(\d{2})(\d{2})(\d{3})$/;
            var arr_data = obj.match(re_fifteen);
            var year = arr_data[2];
            var month = arr_data[3];
            var day = arr_data[4];
            var birthday = new Date('19'+year+'/'+month+'/'+day);
            return verifyBirthday('19'+year,month,day,birthday);
        }
        //身份证18位时，次序为省（3位）市（3位）年（4位）月（2位）日（2位）校验位（4位），校验位末尾可能为X
        if(len == '18')
        {
            var re_eighteen = /^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$/;
            var arr_data = obj.match(re_eighteen);
            var year = arr_data[2];
            var month = arr_data[3];
            var day = arr_data[4];
            var birthday = new Date(year+'/'+month+'/'+day);
            return verifyBirthday(year,month,day,birthday);
        }
        return false;
    };
    //校验日期
    verifyBirthday = function(year,month,day,birthday)
    {
        var now = new Date();
        var now_year = now.getFullYear();
        //年月日是否合理
        if(birthday.getFullYear() == year && (birthday.getMonth() + 1) == month && birthday.getDate() == day)
        {
            //判断年份的范围（3岁到100岁之间)
            var time = now_year - year;
            if(time >= 0 && time <= 130)
            {
                return true;
            }
            return false;
        }
        return false;
    };
    //校验位的检测
    checkParity = function(obj)
    {
        //15位转18位
        obj = changeFivteenToEighteen(obj);
        var len = obj.length;
        if(len == '18')
        {
            var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
            var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
            var cardTemp = 0, i, valnum;
            for(i = 0; i < 17; i ++)
            {
                cardTemp += obj.substr(i, 1) * arrInt[i];
            }
            valnum = arrCh[cardTemp % 11];
            if (valnum == obj.substr(17, 1))
            {
                return true;
            }
            return false;
        }
        return false;
    };
    //15位转18位身份证号
    changeFivteenToEighteen = function(obj)
    {
        if(obj.length == '15')
        {
            var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
            var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
            var cardTemp = 0, i;
            obj = obj.substr(0, 6) + '19' + obj.substr(6, obj.length - 6);
            for(i = 0; i < 17; i ++)
            {
                cardTemp += obj.substr(i, 1) * arrInt[i];
            }
            obj += arrCh[cardTemp % 11];
            return obj;
        }
        return obj;
    };
    w.countDown=function (){
        var time = $(".loginLogoYzm").attr('data-t');
        $(".loginLogoYzm").html((time - 1)+"秒后重新获取");
        $(".loginLogoYzm").attr('data-t',(time - 1));
        time = time - 1;
        if (time == 1) {
            $(".loginLogoYzm").html("获取验证码");
            $(".loginLogoYzm").attr("onClick","getCode();");
            $(".loginLogoYzm").css("color","red");
        } else {
            setTimeout(countDown, 1000);
        }
    }
     w.UrlSearch=function() {
        var name,value;
        var str=location.href; //取得整个地址栏
        // var str="http://baidu.com?ahref=demo1.html";
        var num=str.indexOf("?");
        str=str.substr(num+1); //取得所有参数
        // stringvar.substr(start [, length ]
        var arr=str.split("&"); //各个参数放到数组里
        for(var i=0;i < arr.length;i++){
            num=arr[i].indexOf("=");
            if(num>0){
                name=arr[i].substring(0,num);
                value=arr[i].substr(num+1);
                this[name]=decodeURI(value);
            }
        }
    }
     w.getCookie=function(c_name)
    {
        if (document.cookie.length>0)
        {
            c_start=document.cookie.indexOf(c_name + "=")
            if (c_start!=-1)
            {
                c_start=c_start + c_name.length+1
                c_end=document.cookie.indexOf(";",c_start)
                if (c_end==-1) c_end=document.cookie.length
                return unescape(document.cookie.substring(c_start,c_end))
            }
        }
        return ""
    }
    w. formatDateTime=function(inputTime) {
        var date = new Date(inputTime);
        var y = date.getFullYear();
        var m = date.getMonth() + 1;
        m = m < 10 ? ('0' + m) : m;
        var d = date.getDate();
        d = d < 10 ? ('0' + d) : d;
        var h = date.getHours();
        h = h < 10 ? ('0' + h) : h;
        var minute = date.getMinutes();
        var second = date.getSeconds();
        minute = minute < 10 ? ('0' + minute) : minute;
        second = second < 10 ? ('0' + second) : second;
        return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;
    };
})(window);
