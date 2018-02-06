$(function () {
    queryAjax(1,10,"");
    // 按照名称搜索
    $(".orderListBtn").on("click",function () {
        var userNameGs=$(".userNameGs").val();
        queryAjax(1,10,userNameGs);
    });
    // 点击打开模态框
    $(".bx-sideright").on("click",".orderListSeeBtn", function () {
        // data-toggle="modal" data-target="#myModal"
        $(this).attr({"data-toggle": "modal", "data-target": "#myModal"});
        var states=$(this).attr("state");
        var id=$(this).parents("tr").find("td:last-child").attr("name")
        var name=$(this).parents("tr").find("td:nth-child(2)").text()
        var bearRatio=$(this).parents("tr").find("td:nth-child(3)").text()
        if(states!=0){
            $(".addbasicMan").show();
            $(".delectList").hide();
            if(states==1){//修改
                $(".addbasicMan .name").val(name).attr("readonly",true);
                $(".addbasicMan .bearRatio").val(bearRatio);
                $(".subBtn").attr({"state":1,"name":id});
            }else {
                $(".addbasicMan .name").val("").attr("readonly",false);
                $(".addbasicMan .bearRatio").val("");
                $(".subBtn").attr({"state":2,"name":id});
            }
        }else {
            $(".addbasicMan").hide();
            $(".delectList").show().find(".delectListP").text("您确定要删除"+name+"么？");
            $(".subBtn").attr({"state":0,"name":id});
        }
    })
    $(".subBtn").on("click",function () {
        var names=$(this).attr("state");//names==0 删除 names==1 修改 names ==2 新增
        var id=$(this).attr("name");
        if(names==0){
            var _data={
                id:id
            };
            urls="../admin/api/cxAgencyCompany/deleteCxAgencyCompany";
            ajaxMidify(urls,_data)
        }else {
            var name=$(".name").val();
            var basicManSelect=$(".basicManSelect option:checked").val();
            var bearRatio=$(".bearRatio").val();

            if(names==1){
                var urls="../admin/api/cxAgencyCompany/updateCxAgencyCompany";
                var _data={
                    id:id,
                    state:basicManSelect,
                    bearRatio:bearRatio
                }
                ajaxMidify(urls,_data)
            }else {
                var urls="../admin/api/cxAgencyCompany/addCxAgencyCompany";
                var _data={
                    agencyName:name,
                    bearRatio:bearRatio
                }
                ajaxMidify(urls,_data)
            }

        }
    })
    function ajaxMidify(urls,_data) {
        $.ajax({
            url: urls,
            type: "POST",
            dataType: "json",
            contentType:"application/json",
            data:JSON.stringify(_data),
            success: function (data) {
                console.log(data);
                $(".cloneMOdil").click();
                $(".alertBtn").click();
                $(".modalAlert").text(data.message);
            }
        })
    }
// 分页---------status
    // 分页 首页
    $(".pageHome").on("click",function () {
        queryAjax(1,10,"");
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
            queryAjax(parseInt(pagNumber)-1,10,"")
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
            queryAjax(parseInt(pagNumber)+1,10,"");
        }
    });
    //跳转至
    $(".pagBtn").on("click",function () {
        var pageCount=$(".pageCount").text();
        pageCount=pageCount.replace(/[^0-9]/ig,"")
        console.log(pageCount);
        var pagNumber=$(".pagingInput").val();
        console.log(pagNumber);
        if(parseInt(pagNumber)>parseInt(pageCount)){
            $(".alertBtn").click();
            $(".modalAlert").text("超过总页数");
            return false
        }
        if(pagNumber){
            queryAjax(pagNumber,10,"");
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
    function queryAjax(currentPages,maxRow,agencyName) {
        // 查询列表
        $.ajax({
            url:"../admin/api/cxAgencyCompany/queryCxAgencyCompany?currentPage="+currentPages+"&maxRow="+maxRow+"&agencyName="+agencyName,
            type:"get",
            dataType:"json",
            // contentType:"application/json",
            success:function(data){
                console.log(data);
                if(data.status==0){
                    $(".pageTotal").text('共'+data.totalRow+'条');
                    $(".pageCount").text('共'+data.totalPage+'页');
                    $("#pageFirstCont").text(data.currentPage);
                    if(data.body.length>=1){
                        var str='';
                        $("table tbody").html("")
                        for(var i=0;i<data.body.length;i++){
                            var fi=i+1;
                            var timers=formatDateTime(data.body[i].createTime)
                            str+='<tr><td> '+fi+'</td>';
                            str+='<td> '+data.body[i].agencyName+'</td>';
                            str+='<td> '+data.body[i].bearRatio+'</td>';
                            str+='<td>  '+timers+'</td>';
                            if(data.body[i].state==1){
                                str+='<td>  开启</td>';
                            }else {
                                str+='<td>  停用</td>';
                            }
                            str+='<td name="'+data.body[i].id+'">  <div class="btn-group cutomerBtnModify">' +
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

            }
        });
    }
})
