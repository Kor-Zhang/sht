<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="head">
	<a href="./personalInfo_right_editInfo.jsp">基本资料</a><a href="./personal_right_editImg.jsp">头像照片</a>
	<hr />
</div>

<p>仅支持JPG | GIF | PNG图片文件，且文件小于5M</p>
<div class="load_img">
<img src="../img/load.png" title="请选择图片"/>
<p style="position:absolute;color:black;font-size:20px;top:160px;left:50px;">请选择你要上传的头像</p>
<div id="line"></div>
<!-- <div class="right"></div> -->
</div>
<button >上传</button>
<button id="save_btn">保存</button>
</body>

<style type="text/css">
.head {
	/* text-align:center; */
	font-size: 16px;
	color: grey;
}
.head a {
	margin-left: 90px;
	/* text-decoration:none; */
	color: grey;
}

.load_img img{
	border:solid 1px grey;
	width:300px;
	height:249px;
	margin-left:5%;
	cursor: pointer;
}
button{
	width: 70px;
	height: 35px;
	margin-left: 10%;
	margin-top: 2%;
	border-radius: 5px;
	background-color: rgb(255, 219, 68);
	border: solid 1px rgb(255, 219, 68);
	font-size: 16px;
	cursor: pointer;
}
p{
	color:grey;
	font-size:12px;
	margin-left:5%;
}
#line{
	float:left;
	border-left:solid 1px grey;
	height:300px;
	position:relative;
	left:370px;
	top:-20px;
}
/* .right{
	border:solid 1px black;
	position:absolute;
	top:400px
	width:300px;
	height:300px;
} */
</style>
</html>