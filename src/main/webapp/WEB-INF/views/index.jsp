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
});   

//这个是测试push 的
</script>
</head>
<body>
	<div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide"><img src="/static/images/1.jpg"></div>
            <div class="swiper-slide"><img src="/static/images/1.jpg"></div>
            <div class="swiper-slide"><img src="/static/images/1.jpg"></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
</body>
</html>