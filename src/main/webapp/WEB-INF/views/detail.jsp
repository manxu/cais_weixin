<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
<title>index</title>
<link rel="stylesheet" type="text/css" href="/static/css/swiper.css"> 
<script src="/static/js/jquery.min.js"></script>
<script src="/static/js/swiper.jquery.min.js"></script>
<script type="text/javascript" src="/static/js/Base.js"></script>
<script type="text/javascript" src="/static/js/detail.js"></script>
<style type="text/css">
	.swiper-container {
        width: 500px;
        height: 300px;
        margin: 20px auto;
    }
</style>
<script>
$(function () {
	var swiper = new Swiper('.swiper-container', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        spaceBetween: 30,
        loop:true,
        autoplay: 2500,
        autoplayDisableOnInteraction: false
    });
	
	$.getJSON("/activity/ajaxCurNumber",{},function(data){
		if(data==null){
			$(".cai").show();
			$(".yicai").hide();
		}else{
			$("#yicai").text(data.number);
			$(".yicai").show();
			$(".cai").hide();
		}
	});
	
	
});   

//这个是测试push 的   
</script>
</head>
<body>
	<div class="swiper-container">
        <div class="swiper-wrapper"> 
            <div class="swiper-slide"><img src="/static/images/${ac.id }/1.jpg"></div>
            <div class="swiper-slide"><img src="/static/images/${ac.id }/2.jpg"></div>
            <div class="swiper-slide"><img src="/static/images/${ac.id }/3.jpg"></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
    <div class="content">
    	<table cellpadding="0">
    		<tr><td><span>活动名称</span></td><td><span>${cs.name }</span></td></tr>
    		<tr><td><span>奖品说明</span></td><td><span>${cs.prize }</span></td></tr>
    		<tr><td><span>商家介绍</span></td><td><span>${cs.sellerDesc }</span></td></tr>
    	</table>
    </div>
    <div class="cai" style="display: none;">
    	<div>
    		<span><input type="text" value="" placeholder="填入数字"></span>
    		<span><input type="button" value="提交"></span>
    		<span><input type="button" value="随机"></span>
    	</div>
    </div>
    <div class="yicai"  style="display: none;">
    	<span>你猜的数字是：<span id="yicai"></span></span><br>
    	<div>
    		<span>竞猜结果：</span><span id="cai_result"></span>
    	</div>
    </div>
</body>
</html>
