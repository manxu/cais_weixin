Base = {
	DateFormat:function(str,fmt){
		if(!str){
			return "";
		}
		if(str==''){
			return "";
		}
		str = str.replace(/-/g,"/");
		var date = new Date(str);
		var o = {
		"M+" : date.getMonth()+1,                 //月份   
		"d+" : date.getDate(),                    //日   
		"h+" : date.getHours(),                   //小时   
		"m+" : date.getMinutes(),                 //分   
		"s+" : date.getSeconds(),                 //秒   
		"q+" : Math.floor((date.getMonth()+3)/3), //季度   
		"S"  : date.getMilliseconds()             //毫秒   
		}; 
		if(/(y+)/.test(fmt))   
			fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));   
		for(var k in o)   
			if(new RegExp("("+ k +")").test(fmt))   
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
			return fmt;   
	},
	open:function(options){//-moz-opacity: 0.3; opacity:.30;filter: alpha(opacity=30);
		var shadeHtml = '<div id="shade" style="display: none; position: absolute; top: 0%; left: 0%; width: 100%; height: 100%;'+
		' z-index:1002; '+
		'"><div id="shadecontent" style="text-align:center;background-color:#EFEFEF;width:115px;height:50px;position:absolute; z-index: 1003;display: none;"><div style="margin:0 auto;padding-top:9px;"><img src="/static/images/loading.gif" style="width:32px;height:32px;z-index:102;"/><span>&nbsp;&nbsp;加载中..</span></div></div></div>';
		$(shadeHtml).appendTo('body').show();
		$("#shade").height($(document).height());
		var content = $("#shadecontent");
		var h = content.height();
		var w = content.width();
		var H = $(window).height();
		var W = $(window).width();
		var S = $(document).scrollTop();
		content.css({
			"top" : (H - h) / 2 + S,
			"left" : (W - w) / 2
		}).show();
	},
	close:function(index){
		$("#shade").remove();
	},
	ajax:function(options){
		var self = this;
		var defaults = {
			url:null,
			data:null,
			async:false,
			type:"POST",
			dataType:"json",
			ajax:null,
			error:null
		}
		var opts = $.extend(defaults,options);
		//self.open();
		$.ajax({
			url:opts.url,
			data:opts.data,
			async:opts.async,
			type:opts.type,
			dataType:opts.dataType,
			success:function(d){
				self.close();
				if(opts.ajax){
					opts.ajax(d);
				}
			},
			error:function(d){
				self.close();
				if(opts.error){
					opts.error();
				}
			}
		});	
	},
	alert:function(options){
		
	},
	confirm:function(options){
		
	}
}