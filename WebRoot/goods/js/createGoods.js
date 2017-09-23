/**
 * Created by tom on 2017/9/17.
 */

$(function() {
	var baseUrl = $('#baseUrl').val();
	console.log(baseUrl);
	/**
	 * 点击按钮上传
	 */
	var imgDatas = new Array(),imgDataLen = 0;
	
	$("#create").click(function() {
		var description = $("#description").val();
		var title = $('#title').val();
		var sprice = $('#sprice').val();
		var price = $('#price').val();
		var condition = $('#condition').val();
		var region = $('#region').val();
		
		//判断是否为空
		var isEmpty = judgementEmpty(description,title,sprice,price,condition,region);
		
		if(!isEmpty){
			return false;
		}
		
		var url = "?description="+description+
					"&title="+title+
					"&sprice="+sprice+
					"&price="+price+
					"&condition="+condition+
					"&region="+region+
					"&status=0"+
					
					"&owner=1";
		
		var imgDataJson = JSON.stringify(imgDatas);
		
		uploadImg(url,imgDataJson);

	});
	
	/**
	 * 上传图片
	 */
	function uploadImg(goodsUrl,imgDataJson){
		$.ajax({
			type:"post",
			async:true,
			data:{'img':imgDataJson},
			url:baseUrl+"/goods/createGoodsImagsInfo.action?",
			success:function(data){
				uploadGoodsInfo(goodsUrl);
			},
			error:function(data){
				alert("图片上传失败");
			}
		});
	}
	
	/**
	 * 上传商品信息
	 */
	function uploadGoodsInfo(url){
		$.ajax({
			type : "post",
			async : true, // 同步请求
			url : baseUrl + "/goods/createGoods.action"+url, // 需要访问的地址
			success : function(data) {
				alert("商品发布成功");
			},
			error : function(data) {
				console.log('ajax-失败');
			}
		})
	}
	
	/**
	 * 判断商品信息输入字段是否为空
	 */
	function judgementEmpty(description,title,sprice,price,condition,region){
		if(null == description || "" == description){
			alert("请描述你的商品");
			return false;
		}else if(null == title || "" == title){
			alert("请填写商品标题");
			return false;
		}else if(null == sprice || "" == sprice){
			alert("请填写商品转卖价");
			return false;
		}else if(null == price || "" == price){
			alert("请填写商品原价");
			return false;
		}else if(null == condition || "" == condition){
			alert("请填写商品成色");
			return false;
		}else if(null == region || "" == region){
			alert("请填写商品销售地");
			return false;
		}
		return true;
	}
	
    
    /*
     * 预览并上传图片
     * 
     */
	var uploadNum = 0;
	
	
	$('#file').change(function(e) {
		var file = e.target.files[0];
		
		preview(file);
		
	});
	$('.preview').click(function() {
		$("#file").click();
	});
	
	
	function preview(file) {
		
		//检查图片格式和大小

//		if(file.size > 20480){
//			alert("对不起，图片超过20k，请调整图片大小后上传，谢谢 !");
//			return;
//		}
		var suffix = file.name.substring(file.name.lastIndexOf("."),
				file.name.length);

		if (suffix != ".jpg" && suffix != ".gif" && suffix != ".png"
				&& suffix != ".jpeg" && suffix != ".bmp") {
			alert("对不起，系统仅支持标准格式的照片，请您调整格式后重新上传，谢谢 !");
			return;
		}

		//显示图片
		var img = new Image(), url = img.src = URL.createObjectURL(file);
		//console.log(url);
		img.style.width="100px";
		img.style.height="120px";
		
		var container = $('.add-img>ul');
		
		 //创建读取文件的对象  
	    var reader = new FileReader(); 
	    reader.readAsDataURL(file);
		console.log(file.type);
		
		reader.onerror = function(){
			alert("无法预览该图片");
		}
		
		reader.onprogress = function(){
			console.log("upload...");
		}
		
		reader.onload = function(e) {
			//保存图片数据,base64码
			imgDatas[imgDataLen] = e.target.result;
			imgDataLen ++;
			
			//显示预览图片
			previewImg(container,img);
			uploadNum ++;
			if(uploadNum >=5){
				$('#add').css("display","none");
			}
			
		}
		
	}
	
	function previewImg(container,img){
		var url = img.src;
		var li = $("<li class='preview new-li'></li>");
		container.append(li);
		li.empty().append(img);
		URL.revokeObjectURL(url);
	}
	
})