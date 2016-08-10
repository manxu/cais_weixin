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
<link rel="stylesheet" type="text/css" href="/static/css/animate.css"> 
<script src="/static/js/jquery.min.js"></script>
<script src="/static/js/swiper.jquery.min.js"></script>
<script src="/static/js/swiper.animate1.0.2.min.js"></script>
<style type="text/css">
*{
	margin:0;
	padding:0;
}
html,body{
	height:100%;
}
body{
	font-family:"microsoft yahei";
}
.swiper-container {
  /*  width: 320px;
    height: 480px;*/
	width: 100%;
    height: 100%;
	background:#000;

  
}
img{
	display:block;
}
.swiper-pagination-bullet {
width: 6px;
height: 6px;
background: #fff;
opacity: .4;
}
.swiper-pagination-bullet-active {
opacity: 1;
}
@-webkit-keyframes start {
	0%,30% {opacity: 0;-webkit-transform: translate(0,10px);}
	60% {opacity: 1;-webkit-transform: translate(0,0);}
	100% {opacity: 0;-webkit-transform: translate(0,-8px);}
}
@-moz-keyframes start {
	0%,30% {opacity: 0;-moz-transform: translate(0,10px);}
	60% {opacity: 1;-moz-transform: translate(0,0);}
	100% {opacity: 0;-moz-transform: translate(0,-8px);}
}
@keyframes start {
	0%,30% {opacity: 0;transform: translate(0,10px);}
	60% {opacity: 1;transform: translate(0,0);}
	100% {opacity: 0;transform: translate(0,-8px);}
}
#array{
	position:absolute;z-index:999;-webkit-animation: start 1.5s infinite ease-in-out;
}
</style>
<script>
$(function () {

    var swiper = new Swiper('.swiper-container', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        direction: 'vertical',
        onInit: function(swiper){ //Swiper2.x的初始化是onFirstInit
          swiperAnimateCache(swiper); //隐藏动画元素 
          swiperAnimate(swiper); //初始化完成开始动画
        }, 
        onSlideChangeEnd: function(swiper){ 
          swiperAnimate(swiper); //每个slide切换结束时也运行当前slide动画
        }
    });
    $("#array").css("top",$(window).height()-20);
    $("#array").css("left",($(window).width()-20)/2);
});   

//这个是测试push 的   
</script>
</head>
<body>
	<div class="swiper-container">
        <div class="swiper-wrapper"> 
            <div class="swiper-slide">
            	<p class="ani" style="position: absolute;top: 460px;left: 80px;font-size: 14px;color: greenyellow" swiper-animate-effect="zoomIn" swiper-animate-duration="1.5s" swiper-animate-delay="0s">
            		我可爱的大傻娟
            	</p>
            	<img src="/static/images/1.jpg" style="width: 100%;height: 100%;">
            </div>
            <div class="swiper-slide">
            	<img src="/static/images/2.jpg" style="width: 100%;height: 100%;" >
            </div>
            <div class="swiper-slide">
            	<img src="/static/images/3.jpg" style="width: 100%;height: 100%;" >
            </div>
            <div class="swiper-slide">
            	<img src="/static/images/4.jpg" style="width: 100%;height: 100%;" >
            </div>
            <div class="swiper-slide">
            	<img src="/static/images/5.jpg" style="width: 100%;height: 100%;" >
            </div>
        </div>
        <img src="/static/images/arrow.png" style="width:20px;height:15px;" id="array" class="resize">
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
</body>
</html>
