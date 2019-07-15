//鎼滅储
	
$('[name="nice-select"]').click(function(e){
	    $('[name="nice-select"]').find('ul').hide();
	    $(this).find('ul').show();
		e.stopPropagation();
	});
	$('[name="nice-select"] li').hover(function(e){
		$(this).toggleClass('on');
		e.stopPropagation();
	});
	$('[name="nice-select"] li').click(function(e){
		var val = $(this).text();
		$(this).parents('[name="nice-select"]').find('input').val(val);
		$('[name="nice-select"] ul').hide();
		e.stopPropagation();
	});
	$(document).click(function(){
		$('[name="nice-select"] ul').hide();
});


$(document).ready(function() {
	/*Jquery Mmenu*/
	$("#mmenu").mmenu({
		"extensions": [
        	"effect-menu-slide",
        	"effect-listitems-slide",
            "pagedim-black"
        ],
		"offCanvas": {
			position: "right"
		}
	}).css("opacity","1");
});


$(function () {
    $("img").each(function () {
        if ($(this).attr("src").length == 0 || $(this).attr("src").toLowerCase().indexOf("nopic") != -1) {
            $(this).attr("src", "/UpLoadFile/zanwu.png").removeAttr("height").removeAttr("width").removeAttr("style");
            return true;
        }
    })

    $(".sure").click(function () {
        $(".search_mask").hide();
    })
});



$(document).ready(function () {

    $(function () {
        $("#search").click(function () {
            if ($.trim($("#searchval").val()) == "" || $.trim($("#searchval").val()) == "鎼滅储鍏抽敭瀛�") {
                $(".search_mask").show()
                return false;
            }
            else {
                if ($.trim($("#leixing").val()) == "鏂伴椈") {

                    window.location.href = "/nsearch.shtml?keyword=" + escape($.trim($("#searchval").val()));
                }
                else {
                    window.location.href = "/psearch.shtml?keyword=" + escape($.trim($("#searchval").val()));
                }
            }
        })

        $("#searchval").keydown(function (event) {
            if (event.keyCode == 13) {
                $("#search").click();
            }
        })
    })


    $(".erji").each(function () {
        if ($.trim($(this).html()) == "") {
            $(this).remove();
        }
    })
})


$(".form-select").change(function(){
    if ($.trim($(this).val()) != "") {
        window.open($(this).val());
    }
});