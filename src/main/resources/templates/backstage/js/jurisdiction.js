$(function () {
    var _data={
        currentPage:1,
        pageSize:10,
        parameters:{}
    }
    queryAjax(_data);
    // 按照名称搜索
    $(".orderListBtn").on("click",function () {
        var userNameGs=$(".userNameGs").val();
        var _data={
            currentPage:1,
            pageSize:1,
            parameters:{
                adminName:userNameGs
            }
        };
        queryAjax(_data);
    });
    // 账号类型控制地区
    $(".administratorsType").on("change",function () {
        var valId=$(this).val();
        if(valId==1||valId==2||valId==6){
            $(".selectCity").hide();
        }else {
            $(".selectCity").show()
            cityArr(valId,3,[])
        }
        $.ajax({
            url: "../admin/findAllRole?type="+valId,
            type: "get",
            dataType: "json",
            contentType:"application/json",
            // data:JSON.stringify(_data),
            success: function (data){
                console.log(data);
                var str='';
                for(var i=0;i<data.length;i++){
                    str+='<option value="'+data[i].id+'">'+data[i].roleName+'</option>'
                }
                $(".administratorsNmae").html(str)
            }
        });
    });
    // 点击打开模态框
    $(".bx-sideright").on("click",".orderListSeeBtn", function () {
        // data-toggle="modal" data-target="#myModal"
        $(this).attr({"data-toggle": "modal", "data-target": "#myModal"});
        var states=$(this).attr("state");//判断打开时状态  states==0 删除 states==1 修改  states==2新增
        var id=$(this).parents("tr").find("td:last-child").attr("name");//id
        var name=$(this).parents("tr").find("td:nth-child(2)").text();//用户名
        var adminType=Number($(this).parents("tr").find("td:nth-child(3)").attr("state"));//账号类型
        var adminTypeArr=[];
        var  adminTypeOption=$(this).parents("tr").find("td:nth-child(3)").attr("name");
        if(adminType==3||adminType==4||adminType==5){//===3省代理  ==4市代理   ==5区县代理

            adminTypeArr= adminTypeOption.split(",")
            console.log(adminTypeOption);
            console.log(adminTypeArr);
        }
        var jiaose=$(this).parents("tr").find("td:nth-child(4)").attr("state");//角色
        var adminState=$(this).parents("tr").find("td:nth-child(5)").attr("state");//状态
        if(states!=0){
            $(".addbasicMan").show();
            $(".delectList").hide();
            if(states==1){//修改
                $("#myModalLabel").text("修改管理")
                $(".addbasicMan .name").val(name).attr("readonly",true);
                // $(".add-area option[value='${districtId}']")
                console.log(adminType);
                console.log(typeof adminType);
                $(".administratorsType option[value='"+adminType+"']").attr("selected",true).siblings().attr("selected",false);//根据值让option选中
                $('.administratorsType').trigger("change");
               $(".arrInput").val(adminTypeArr)
                cityArr(adminType,33,adminTypeArr);

                if(adminTypeOption!=0){
                    $(".selectCity").show()
                }else {
                    $(".selectCity").hide()
                }
                $(".administratorsType").attr("disabled",true);
                // $(".administratorsNmae").attr("disabled",true);
                $(".adminPasswo").hide();
                $(".subBtn").attr({"state":1,"name":id});
            }else {// 新增
                // cityArr(adminType,3,[]);
                $("#myModalLabel").text("新增管理")
                $(".adminPasswo").show()
                $(".addbasicMan .name").val("").attr("readonly",false);
                $(".administratorsType option[value='1']").attr("selected",true).siblings().attr("selected",false);//根据值让option选中
                $('.administratorsType').trigger("change");
                $(".administratorsType").attr("disabled",false);
                // $(".administratorsNmae").attr("disabled",false);
                $(".subBtn").attr({"state":2,"name":id});
                document.getElementById("adminAdd").reset();
            }
        }else {
            $("#myModalLabel").text("删除管理")
            $(".addbasicMan").hide();
            $(".delectList").show().find(".delectListP").text("您确定要删除"+name+"么？");
            $(".subBtn").attr({"state":0,"name":id});
        }
    })
    $(".subBtn").on("click",function () {
        var names=$(this).attr("state");//names==0 删除 names==1 修改 names ==2 新增
        var id=$(this).attr("name");
        if(names==0){//删除
            var urls="../admin/putAdmin";
            var _data={
                id:id,
                adminState:-1
            };
            ajaxMidify(urls,_data)
            // $.ajax({
            //     url: "../admin/putAdmin",
            //     type: "put",
            //     dataType: "json",
            //     contentType:"application/json",
            //     data:JSON.stringify(_data),
            //     success: function (data) {
            //         console.log(data);
            //         $(".cloneMOdil").click();
            //         $(".alertBtn").click();
            //         $(".modalAlert").text(data.message);
            //         var _data={
            //             currentPage:1,
            //             pageSize:10,
            //             parameters:{}
            //         };
            //         queryAjax(_data);
            //     }
            // })
        }else {
            var name=$(".name").val();//登录用户名
            var adminPassword=$(".adminPassword").val();//登录密码
            var administratorsType=$(".administratorsType option:checked").val();//账号类型
            var province=$(".add-province option:checked").val();//省
            var city=$(".add-city option:checked").val();//市
            var area=$(".add-area option:checked").val();//区
            var administratorsNmae=$(".administratorsNmae option:checked").val();//选择角色
            var adminState=$(".administratorsNmae option:checked").val();//状态
            if(names==1){//修改
                var urls="../admin/updateAdmin";
                var _data={
                    id:id,
                    adminState:adminState,
                    roleId:administratorsNmae
                };
                if(administratorsType==3){
                    _data.adminProvinc=province
                }else if(administratorsType==4){
                    _data.adminProvinc=province;
                    _data.adminCiti=city
                }else if(administratorsType==5){
                    _data.adminProvinc=province;
                    _data.adminCiti=city
                    _data.adminArea=area
                }
                ajaxMidify(urls,_data)
            }else {//新增
                var urls="../admin/addAdmin";
                var _data={
                    adminName:name,
                    adminPass:adminPassword,
                    roleId:administratorsNmae,
                    adminType:administratorsType
                }
                if(administratorsType==3){
                    _data.adminProvinc=province
                }else if(administratorsType==4){
                    _data.adminProvinc=province;
                    _data.adminCiti=city
                }else if(administratorsType==5){
                    _data.adminProvinc=province;
                    _data.adminCiti=city
                    _data.adminArea=area
                }
                ajaxMidify(urls,_data)
            }
        }
    })
    function ajaxMidify(urls,_data) {
        $.ajax({
            url: urls,
            type: "put",
            dataType: "json",
            contentType:"application/json",
            data:JSON.stringify(_data),
            success: function (data) {
                console.log(data);
                $(".cloneMOdil").click();
                $(".alertBtn").click();
                $(".modalAlert").text(data.message);
                var _data={
                    currentPage:1,
                    pageSize:10,
                    parameters:{}
                }
                queryAjax(_data);
            }
        })
    }
// 分页---------status
    // 分页 首页
    $(".pageHome").on("click",function () {
        var _data={
            currentPage:1,
            pageSize:10,
            parameters:{}
        }
        queryAjax(_data);
    });
    //上一页
    $(".pageUpper").on("click",function () {
        var pagNumber=$("#pageFirstCont").text();
        if(pagNumber==1){
            $(".alertBtn").click();
            $(".modalAlert").text("已是第一页");
            return false
        }
        if(pagNumber !==null && pagNumber !==undefined && pagNumber!==false){
            var _data={
                currentPage:parseInt(pagNumber)-1,
                pageSize:10,
                parameters:{}
            }
            queryAjax(_data);
        }


    });
    //下一页
    $(".pageNext").on("click",function () {
        var pagNumber=$("#pageFirstCont").text();
        var pageCount=$(".pageCount").text();
        pageCount=pageCount.replace(/[^0-9]/ig,"")
        if(parseInt(pagNumber)>=parseInt(pageCount)){
            $(".alertBtn").click();
            $(".modalAlert").text("已经是最后一页了");
            return false
        }
        if(parseInt(pagNumber) !==null || parseInt(pagNumber) !==undefined){
            var _data={
                currentPage:parseInt(pagNumber)+1,
                pageSize:10,
                parameters:{}
            }
            queryAjax(_data);
        }
    });
    //跳转至
    $(".pagBtn").on("click",function () {
        var pageCount=$(".pageCount").text();
        pageCount=pageCount.replace(/[^0-9]/ig,"")
        var pagNumber=$(".pagingInput").val();
        if(parseInt(pagNumber)>parseInt(pageCount)){
            $(".alertBtn").click();
            $(".modalAlert").text("超过总页数");
            return false
        }
        if(pagNumber){
            var _data={
                currentPage:pagNumber,
                pageSize:10,
                parameters:{}
            }
            queryAjax(_data);
        }
    });
    // input绑定事件
    $(".pagingInput").on("blur",function () {
        $(document).keydown(function(event){
            if(event.keyCode == 13){ //绑定回车
                $('.pagBtn').click(); //自动/触发登录按钮
            }
        });
    })

    /**
     *  查询ajax
     * @param currentPage //页数（可为空）
     * @param maxRow //条数（可为空）
     * @param agencyName //按照中介公司名称进行模糊查询（可为空）
     */
    function queryAjax(_data) {

        // 查询列表
        $.ajax({
            url:"../admin/findAllAdmin",
            type:"post",
            dataType:"json",
            contentType:"application/json",
            data:JSON.stringify(_data),
            success:function(date){
                var data=[];
                data=date.results;
                console.log(date);
                $(".pageTotal").text('共'+date.totalRow+'条');
                $(".pageCount").text('共'+date.totalPage+'页');
                $("#pageFirstCont").text(date.currentPage);
                if(data.length>0){
                    var str='';
                    $("table tbody").html("")
                    for(var i=0;i<data.length;i++){
                        var fi=i+1;
                        var timers=formatDateTime(data[i].createTime)
                        str+='<tr><td> '+fi+'</td>';
                        str+='<td> '+data[i].adminName+'</td>';
                        // if(){
                        //     str+='<td>  普通管理员</td>';
                        // }else if()
                        var adminTypeNum=Number(data[i].adminType)
                        switch(adminTypeNum) {
                            case 1:
                                str+='<td state="'+data[i].adminType+'" name="0">  普通管理员</td>';
                                break;
                            case 2:
                                str+='<td state="'+data[i].adminType+'" name="0">  车拇指</td>';
                                break;
                            case 3:
                                str+='<td state="'+data[i].adminType+'" name="'+data[i].adminProvinc+'">  省代理</td>';
                                break;
                            case 4:
                                str+='<td state="'+data[i].adminType+'" name="'+data[i].adminProvinc+','+data[i].adminCiti+'">  市代理</td>';
                                break;
                            case 5:
                                str+='<td state="'+data[i].adminType+'" name="'+data[i].adminProvinc+','+data[i].adminCiti+','+data[i].adminArea+'">  区县代理</td>';
                                break;
                            case 6:
                                str+='<td state="'+data[i].adminType+'" name="0">  渠道</td>';
                                break;

                        }
                        str+='<td state="'+data[i].roleId+'">'+data[i].roleName+'</td>';
                        str+='<td>  '+timers+'</td>';
                        if(data[i].adminState==1){
                            str+='<td state="'+data[i].adminState+'">  开启</td>';
                        }else {
                            str+='<td state="'+data[i].adminState+'">  停用</td>';
                        }
                        str+='<td name="'+data[i].id+'" >  <div class="btn-group cutomerBtnModify">' +
                            '<button type="button" class="btn btn-default" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>编辑</button>' +
                            '<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">' +
                            '<span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button>' +
                            '<ul class="dropdown-menu" role="menu"><li><a href="javascript:;" class="orderListSeeBtn" state="0">删除</a></li>' +
                            '<li><a href="javascript:void(0);" class="orderListSeeBtn" state="1">修改</a></li>' +
                            '</ul></div></td>';
                    }
                    $("table tbody").html(str)
                }

            }
        });
    }
    $(".add-province").on("change",function () {
        var valIds=$(".administratorsType").val();
        var names=$(".subBtn").attr("state");//names==0 删除 names==1 修改 names ==2 新增
        names=Number(names)
        var types;
        if(names==1){
            types=3
        }else {
            types=33
        }
        // var arrData=$(".arrInput").val()
        province(valIds,types,[])
    })
    /**
     * valIds===3省代理  ==4市代理   ==5区县代理
     * types==3 查询空余的接口 ==33查询所有
     * @param valIds
     */
    function cityArr(valIds,types,arrData) {
        valIds=Number(valIds);
        types=Number(types);
        if(valIds==3){
            $(".add-city").html("").attr("disabled",true);
            $(".add-area").html("").attr("disabled",true)
        }else if(valIds==4){
            $(".add-city").html("").attr("disabled",false);
            $(".add-area").html("").attr("disabled",true)
        }else if(valIds==5){
            $(".add-city").html("").attr("disabled",false);
            $(".add-area").html("").attr("disabled",false)
        }

        //获取省
        $.ajax({
            type:"get",//读取方式
            url:"../findProvinces",//通过url去读取json/数据
            contentType:"application/json",
            dataType:"json",
            data:"type="+types,
            // async:false,
            success:function(date){//result变量去接收json数据
                    $(".add-province").html("");
                    for(var i=0;i<date.length;i++) {
                        $('.add-province').append("<option value='"+date[i].provinceid+"'>"+date[i].province+"</option>")
                    }
                    // $('.add-province').trigger("change");
                    if(types.length==1){
                        types=4
                    }else if(types.length==2){
                        types=44
                    }
                    if(arrData.length>=1){
                        $(".add-province option[value='"+arrData[0]+"']").attr("selected",true);//根据值让option选中
                    }
                province(valIds,types,arrData)
                $('.add-province').trigger("change");
            }//success
        })


    }
})

// 获取市
function province(valIds,types,arrData) {

    console.log(1)
    var selectVal=$(".add-province option:selected").val();
    $.ajax({
        type:"get",//读取方式
        url:"../findCity",//通过url去读取json/数据
        contentType: "application/json",
        dataType:"json",
        // async:false,
        data:"type="+types+"&provinceid="+selectVal,//是否向后台传参数
        success:function(date){//result变量去接收json数据

            if(valIds==4||valIds==5) {
                $(".add-city").html("");

                for(var i=0;i<date.length;i++) {
                    $('.add-city').append("<option value='"+date[i].cityid+"'>"+date[i].city+"</option>")
                }
                // $('.add-city').trigger("change");

                if(types.length==1){
                    types=5
                }else if(types.length==2){
                    types=55
                }
                if(arrData.length>=2){

                    $(".add-city option[value='"+arrData[1]+"']").attr("selected",true);//根据值让option选中
                }
                city(valIds,types,arrData)
            }else {
                $(".add-city").html("");
                $(".add-area").html("");
            }
        }//success
    });

}
function city(valIds,types,arrData) {
    console.log(2);
    var selectVal=$(".add-city option:selected").val();
    $.ajax({
        type:"get",//读取方式
        url:"../findArea",//通过url去读取json/数据
        dataType:"json",
        // async:false,
        contentType: "application/json",
        data:"type="+types+"&cityid="+selectVal,//是否向后台传参数
        success:function(date){//result变量去接收json数据
            if(valIds==5){
                $(".add-area").html("");
                for(var i=0;i<date.length;i++) {
                    $('.add-area').append("<option value='"+date[i].areaid+"'>"+date[i].area+"</option>")
                }
                if(arrData.length>=3){
                    $(".add-area option[value='"+arrData[2]+"']").attr("selected",true);//根据值让option选中
                }
            }else {
                $(".add-area").html("");
            }
        }//success
    });
}