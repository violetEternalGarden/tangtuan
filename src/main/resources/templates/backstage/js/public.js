$(document).ready(function() {
    setSysboxWidth();
    //绑定事件
    $(window).on("resize",function(){
        setSysboxWidth();
    })
})
function setSysboxWidth(){
    var winWidth=$(window).width();
    var winHeight=$(window).height();
    var sideRightWidth=winWidth-230;
    $(".bx-sideright").css("width",sideRightWidth);
    $(".bx-content").css("height",(winHeight-80));

}
$(function() {
    // 获取左边菜单栏
    $.ajax({
        url: "../admin/loginSuccess?adminName=root",
        type: "get",
        dataType: "json",
        contentType:"application/json",
        // data:JSON.stringify(_data),
        success: function (data) {
            console.log(data);
            var str='';
            if(data.catas.length>=1){
                for(var i=0;i<data.catas.length;i++){
                    str+='<ul id="accordion" class="accordion"> <li>' +
                        ' <div class="link" href="index.html">' +
                        '<i class="glyphicon glyphicon-home" style="margin-top: 4px;float: left;margin-right: 14px;"></i>运营数据' +
                        '</div><ul class="submenu"> <li><a href="orderList.html">订单列表</a></li></ul>' +
                        '</li></ul>' +
                        ''
                }
            }
        }
    })

    var Request=new UrlSearch(); //实例化
    var ulLi=$("#accordion a");
    ulLi.each(function () {
        // console.log(this)
        if(Request.ahref){
            // console.log(Request.ahref)
            var $href=$(this).attr("href");
            // console.log("a href-------------"+$href);
            if(Request.ahref==$href){
                if($(this).attr("class")=="link"){
                    $(this).parent("li").addClass('accordion_active');
                }else {
                    $(this).parents(".submenu").parent("li").addClass('accordion_active');
                }
            }
        }
    })
    var Accordion = function(el, multiple) {
        this.el = el || {};
        this.multiple = multiple || false;

        // Variables privadas
        var links = this.el.find('.link');
        // Evento
        links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown)
    }

    Accordion.prototype.dropdown = function(e) {
        var $el = e.data.el;
        $this = $(this);
        $next = $this.next();
        $next.slideToggle();
        $this.parent().toggleClass('open');
        $this.parent().addClass('accordion_active');
        $this.parent().siblings().removeClass('accordion_active');
        if (!e.data.multiple) {
            $el.find('.submenu').not($next).slideUp().parent().removeClass('open');
        };
    }

    var accordion = new Accordion($('#accordion'), false);



});


