<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String ctxPath = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ctxPath+"/";
%>

<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<meta charset="UTF-8">
	<title>风格</title>
	<script type="text/javascript" charset="UTF-8" src="<%=basePath%>catalog/js/login/prefixfree.min.js"></script>
	<link href="<%=basePath%>catalog/css/login/login.css" media="all" type="text/css" rel="stylesheet">
<style type="text/css">

</style>
</head>
<body>

	   <div class="content">
           <form action="" method="post" class="login-form">
               <div class="username">
                   <input type="text" name="username" placeholder="emma.watson@gmail.com" autocomplete="on" />
                   <span class="user-icon icon">u</span>
               </div>
               <div class="password">
                   <input type="password" name="password" placeholder="*******" />
                   <span class="password-icon icon">p</span>
               </div>
               <div class="account-control">
                   <input type="checkbox" name="Remember me" id="Remember me" value="Remember me" checked="checked" />
                   <label for="Remember me" data-on="c" class="check"></label>
                   <label for="Remember me" class="info">Remember me</label>
                   <button type="submit">Login</button>
               </div>
               <p class="not-registered">Not a registered user yet?<a>Sign up now!</a></p>
           </form>
	   </div>
<!-- <div style="text-align:center;clear:both"> -->
<%-- <script src="<%=basePath%>catalog/js/login/gg_bd_ad_720x90.js" type="text/javascript"></script> --%>
<%-- <script src="<%=basePath%>catalog/js/login/follow.js" type="text/javascript"></script> --%>
<!-- </div> -->
</body>
</html>