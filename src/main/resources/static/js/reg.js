// 头部不显示亮下划线
$(function () {
    var $menuLi = $(".header .header-contain .menu li");
    $.each($menuLi, function (i, obj){
        obj.removeAttribute("class", "active");
    });
});

$(function () {
    var $btn = $(".page .main form div .sendcode");
    var count;
    var timer=undefined;

    function sendCodeTimer() {
        if( 1 === count ){
            clearInterval(timer);
            timer=undefined
            $btn.html("重新发送");
        }
        else{
            count--;
            $btn.html(count + "s");
        }
    }
    function sendCodeClick() {
        if(timer === undefined ){
            count = 10;
            $btn.html(count + "s");
            timer = setInterval(sendCodeTimer, 1000);
        }
    }
    $btn.click(sendCodeClick);
});