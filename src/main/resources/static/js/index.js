$(function () {
    var $picLi = $(".main .main-box .banner .pic li");
    var $tabLi = $(".main .main-box .banner .tab li");
    var $btnLI = $(".main .main-box .banner .btn li");
    var $banner = $(".main .main-box .banner");
    var picIndex = 0;
    var len = $picLi.length;
    var timer;

    // 初始化显示
    $picLi.hide().eq(picIndex).show();
    $tabLi.eq(picIndex).addClass("active");

    function change(n) {
        if( n != picIndex ){
            $picLi.eq(picIndex).fadeOut(2000);
            $tabLi.eq(picIndex).removeClass("active");
            picIndex = n;
            $picLi.eq(picIndex).fadeIn(2000);
            $tabLi.eq(picIndex).addClass("active");
        }
    }

    // 点击事件
    $tabLi.click(function () {
        change($(this).index());
    });
    $btnLI.click(function () {
        var index = picIndex;
        if($(this).index()){
            index++;
            index %= len;
        }
        else{
            if(0 === index){
                index = len;
            }
            index--;
        }
        change(index);
    });

    // 定时器
    function auto() {
        timer = setInterval(function () {
            var index = picIndex;
            index++;
            index %= len;
            change(index);
        }, 5000);
    }
    function mouseIn(){
        clearInterval(timer);
    }
    auto();
    $banner.hover(mouseIn, auto);
});

$(function () {
   var $nav = $(".main .main-box .main-contain .news .nav li");
   var $content = $(".main .main-box .main-contain .news .content li");
   var index = 0;

   // 初始化
   $nav.eq(index).addClass("active");
   $content.hide().eq(index).show();

   $nav.click(function () {
       var i = $(this).index();

       if (i != index) {
           $nav.eq(index).removeClass("active");
           $content.eq(index).hide();
           index = i;
           $nav.eq(index).addClass("active");
           $content.hide().eq(index).show();
       }
   });
});