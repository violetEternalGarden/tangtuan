$(function () {
    queryAjax(0);
    // 新增管理员
    $(".roleAddBtn").on("click",function () {
        var typeAdmin=$("select[name='typeAdmin'] option:selected").val();
        var roleName=$("input[name='customerUsername']").val();
        if(roleName){
            var _data={
                roleName:roleName,
                type:typeAdmin
            };
            $.ajax({
                url: "../admin/addRole",
                type: "post",
                dataType: "json",
                contentType:"application/json",
                data:JSON.stringify(_data),
                success: function (data) {
                    console.log(data);
                    queryAjax(0);
                    $(".alertBtn").click();
                    $(".modalAlert").text(data.message);
                }
            })
        }else {
            $(".alertBtn").click();
            $(".modalAlert").text("请填写名称");
        }

    });
    // 按照名称搜索
    $(".orderListBtn").on("click",function () {
        var typeAdmin=$("select[name='querySelect'] option:selected").val();
        queryAjax(typeAdmin);
    });
    // 点击打开模态框
    $(".bx-sideright").on("click",".orderListSeeBtn", function () {
        // data-toggle="modal" data-target="#myModal"
        $(this).attr({"data-toggle": "modal", "data-target": "#myModal"});
        var states=$(this).attr("state");//states==0 删除 states==1 修改权限 states ==2 修改角色
        var id=$(this).parents("tr").find("td:last-child").attr("name");//id
        var name=$(this).parents("tr").find("td:nth-child(2)").text();//角色名
        var stateType=$(this).parents("tr").find("td:nth-child(3)").attr("state");
        var _state=$(this).parents("tr").find("td:nth-child(5)").attr("state");
        if(states!=0){
            $(".addbasicMan").show();
            $(".delectList").hide();
            if(states==1){//修改权限
                $(".reloBox").show();
                $(".addbasicMan .name").val(name).attr("disabled",true);
                $(".administratorsType").attr("disabled",true).find("option[value='"+stateType+"']").attr("selected",true).siblings().attr("selected",false);//根据值让option选中;
                $(".basicManSelect").attr("disabled",true).find("option[value='"+_state+"']").attr("selected",true).siblings().attr("selected",false);//根据值让option选中;
                $(".subBtn").attr({"state":1,"name":id});

                $.ajax({
                    url: "../admin/findRoleModulars?roleId="+stateType,
                    type: "get",
                    dataType: "json",
                    contentType:"application/json",
                    async:false,
                    success: function (data){
                        console.log(data);
                        $(".reloOperationBox").html("")
                        var str='';
                        for(var i=0;i<data.catas.length;i++){

                            str+='<ul class="roleBoxUl">'
                            if(data.catas[i].children.length>=1){
                                str+= '<li class="roleBoxli">'
                                str+= '<label class="checkbox">'
                                str+=   ' <input type="checkbox" name="checked" value="'+data.catas[i].id+'">'+data.catas[i].pageName+' </label>'
                                str+= '<ul class="roleBoxMenu">'
                                for(var j=0;j<data.catas[i].children.length;j++){

                                    str+= '<li><label class="checkbox"><input type="checkbox" name="checkedTw" value="'+data.catas[i].children[j].id+'" '
                                    for(var k=j;k<data.modular.length;k++){
                                        if(data.catas[i].children[j].id==data.modular[k]){
                                            str+= 'checked="checked"'
                                        } else {
                                        }
                                    }
                                    str+='>'+data.catas[i].children[j].pageName+'</label>'
                                    str+=  '</li>'
                                }
                                str+=  '</ul></li>'
                            }
                            str+=  '</ul>'

                        }
                        // var str='';
                        // for(var i=0;i<data.length;i++){
                        //     str+='<option value="'+data[i].id+'">'+data[i].roleName+'</option>'
                        // }
                        $(".reloOperationBox").html(str)
                        $(".reloOperationBox input[name='checked']").each(function () {
                            var checkLength = $(this).parents("li").find("input[name='checkedTw']").length;
                            var checkedLength= $(this).parents("li").find("input[name='checkedTw']:checked").length;
                            if(checkLength==checkedLength){
                                $(this).prop("checked",true)
                            }else {
                                $(this).prop("checked",false)
                            }
                        })
                    }
                });
            }else {//修改角色
                $(".reloBox").hide();
                $(".addbasicMan .name").val(name).attr("disabled",false);
                $(".administratorsType").attr("disabled",false).find("option[value='"+stateType+"']").attr("selected",true).siblings().attr("selected",false);//根据值让option选中;
                $(".basicManSelect").attr("disabled",false).find("option[value='"+_state+"']").attr("selected",true).siblings().attr("selected",false);//
                $(".subBtn").attr({"state":2,"name":id});
            }
        }else {
            $(".addbasicMan").hide();
            $(".delectList").show().find(".delectListP").text("您确定要删除"+name+"么？");
            $(".subBtn").attr({"state":0,"name":id});
        }
    });
    // 复选框全选
    $(".reloOperationBox").on("click","input[name='checked']",function () {
        console.log($(this).val());
        var checkeds = $(this).prop("checked");
        if(checkeds){
            $(this).parents("li").prop("checked",true).find("input[name='checkedTw']").prop("checked",true)
        }else {
            $(this).parents("li").prop("checked",false).find("input[name='checkedTw']").prop("checked",false)
        }
    })
// 复选框单选
    $(".reloOperationBox").on("click","input[name='checkedTw']",function () {
        var checkLength = $(this).parents("ul").find("input[name='checkedTw']").length;
       var checkedLength= $(this).parents("ul").find("input[name='checkedTw']:checked").length;
        if(checkLength==checkedLength){
            $(this).parents(".roleBoxli").find("input[name='checked']").prop("checked",true)
        }else {
            $(this).parents(".roleBoxli").find("input[name='checked']").prop("checked",false)
        }
    });
    // 提交按钮事件
    $(".subBtn").on("click",function () {
        var names=$(this).attr("state");//names==0 删除 names==1 修改权限
        var id=$(this).attr("name");
        var states=$(".basicManSelect option:selected").val();
        if(names==0){//names==0 删除
            var _data={
                id:id
            };
            urls="../admin/deleteRole";
            ajaxMidify(urls,_data,'delete')
        }else {
            var name=$(".name").val();
            // var modulars=[];
            var str='';
            $(".reloOperationBox input[name='checkedTw']:checked").each(function () {
                str+=$(this).val()+','
            })
            console.log(str);


            if(names==1){//names==1 修改权限

                var urls="../admin/updateRoleModular";
                var _data={
                    roleId:id,
                    modulars:str
                }
                ajaxMidify(urls,_data,'put')
            }else {//names ==2 修改角色
                var urls="../admin/updateAdminRole";
                var _data={
                    id:id,
                    roleName:name,
                    state:states
                }
                ajaxMidify(urls,_data,'put')
            }

        }
    })
    function ajaxMidify(urls,_data,types) {
        $.ajax({
            url: urls,
            type: types,
            dataType: "json",
            contentType:"application/json",
            data:JSON.stringify(_data),
            success: function (data) {
                console.log(data);
                queryAjax(0);
                $(".cloneMOdil").click();
                $(".alertBtn").click();
                $(".modalAlert").text(data.message);
            }
        })
    }
    /**
     *  查询ajax
     * @param currentPage //页数（可为空）
     * @param maxRow //条数（可为空）
     * @param agencyName //按照中介公司名称进行模糊查询（可为空）
     */
    function queryAjax(types) {
        // 查询列表
        $.ajax({
            // url:"../admin/findAllRole?type="+types,
            url:"../admin/findAllRole?type="+types,
            type:"get",
            dataType:"json",
            // contentType:"application/json",
            success:function(data){
                console.log(data);
                if(data.length>=1){
                    var str='';
                    $("table tbody").html("");
                    for(var i=0;i<data.length;i++){
                        var fi=i+1;
                        var timers=formatDateTime(data[i].createTime);
                        str+='<tr><td> '+fi+'</td>';
                        str+='<td> '+data[i].roleName+'</td>';
                        var adminTypeNum=Number(data[i].type)
                        switch(adminTypeNum) {
                            case 1:
                                str+='<td state="'+data[i].type+'" >  普通管理员</td>';
                                break;
                            case 2:
                                str+='<td state="'+data[i].type+'" >  车拇指</td>';
                                break;
                            case 3:
                                str+='<td state="'+data[i].type+'" >  省代理</td>';
                                break;
                            case 4:
                                str+='<td state="'+data[i].type+'" >  市代理</td>';
                                break;
                            case 5:
                                str+='<td state="'+data[i].type+'" >  区县代理</td>';
                                break;
                            case 6:
                                str+='<td state="'+data[i].type+'" >  渠道</td>';
                                break;

                        }
                        str+='<td>  '+timers+'</td>';
                        if(data[i].state==1){
                            str+='<td state="'+data[i].state+'">  开启</td>';
                        }else {
                            str+='<td state="'+data[i].state+'">  停用</td>';
                        }
                        str+='<td name="'+data[i].id+'">  <div class="btn-group cutomerBtnModify">' +
                            '<button type="button" class="btn btn-default" data-toggle="dropdown"><i class="glyphicon glyphicon-cog"></i>编辑</button>' +
                            '<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">' +
                            '<span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button>' +
                            '<ul class="dropdown-menu" role="menu"><li><a href="javascript:;" class="orderListSeeBtn" state="0">删除</a></li>' +
                            '<li><a href="javascript:void(0);" class="orderListSeeBtn" state="1">修改权限</a></li>' +
                            '<li><a href="javascript:void(0);" class="orderListSeeBtn" state="2">修改角色</a></li>' +
                            '</ul></div></td>';
                    }
                    $("table tbody").html(str)
                }

            }
        });
    }
})
