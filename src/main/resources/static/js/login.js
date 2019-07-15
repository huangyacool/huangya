// 头部不显示亮下划线
$(function () {
    var $menuLi = $(".header .header-contain .menu li");
    $.each($menuLi, function (i, obj){
        obj.removeAttribute("class", "active");
    });
});