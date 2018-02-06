$(function () {
    var Request=new UrlSearch(); //实例化
    if(Request.message){
        $(".alertBtn").click();
        $(".modalAlert").text(Request.message);
    }
    $(".login-btn").on("click",function () {
        var adminName=$("input[name='adminName']").val();
        var adminPass=$("input[name='adminPass']").val();
        if(adminName&&adminPass){
            $("#loginForm").submit();
        }else if(adminName==false){
            $(".alertBtn").click();
            $(".modalAlert").text("请输入账号");
        }else {
            $(".alertBtn").click();
            $(".modalAlert").text("请输入密码");
        }
    })

});