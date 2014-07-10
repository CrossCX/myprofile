<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String ctxPath = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ctxPath+"/";
	long currentTime = System.currentTimeMillis();
	String SYSTEM_NAME = "XXX理平台";
	String SYSTEM_COPYRIGHT = "中国公司版权所有";
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的博客</title>
	<base id="baseUrl" href="<%=basePath%>">
	<link href="<%=basePath%>catalog/plugins/wblrk/assets/css/bootstrap.css" rel="stylesheet">
	<link href="<%=basePath%>catalog/plugins/wblrk/assets/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="<%=basePath%>catalog/plugins/wblrk/css/styles.css" rel="stylesheet">
	<style type="text/css">
	
		.blog-category{
			width:80%;
			background-color: #e2e2e2;
		    background-image: linear-gradient(to bottom, #eeeeee, #e2e2e2);
		    background-repeat: repeat-x;
		    border-bottom: 1px solid #c1c1c1;
		    height: 45px;
		    margin: 0 auto;
		    padding: 15px;
		    text-shadow: 0 1px 0 rgba(255, 255, 255, 0.6);
		}
	
		
	</style>
</head>
<body>
	<!-- header -->
		<div id="header" class="navbar">
			<div class="navbar-inner">
				<!-- company or app name -->
				<a class="brand hidden-phone" href="index.html">时尚时代</a>
				
				<!-- nav icons -->
				<ul class="nav">
				
					<li class="visible-phone">
						<a href="#"><i class="icon-large icon-search"></i></a>
					</li>
					
					<li>
						<a href="#">
							<i class="icon-large icon-globe"></i>
						</a>
					</li>
					
					<li>
						<a href="#">
							<i class="icon-large icon-envelope"></i>
						</a>
					</li>
					
					<li>
						<a href="#">
							<i class="icon-large icon-cog"></i>
						</a>
					</li>
					
				</ul>
				
				<ul class="nav pull-right">
					
					<!-- dropdown user account -->
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-large icon-user"></i>
						</a>
						
						<ul class="dropdown-menu dropdown-user-account">
						
							<li class="account-img-container">
								<img class="thumb account-img" src="library/images/100/07.png" />
							</li>
							
							<li class="account-info">
								<h3>Geunevere Calista</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
								<p>
									<a href="#">Edit</a> | <a href="#">Account Settings</a>
								</p>
							</li>
							
							<li class="account-footer">
								<div class="row-fluid">
								
									<div class="span8">
										<a class="btn btn-small btn-primary btn-flat" href="#">Change avatar</a>
									</div>
									
									<div class="span4 align-right">
										<a class="btn btn-small btn-danger btn-flat" href="#">Logout</a>
									</div>
									
								</div>									
							</li>
							
						</ul>
					</li>
					<!-- ./ dropdown user account -->
				</ul>
				
				<!-- search form -->
				<form class="navbar-search pull-right hidden-phone" action="">
					<input type="text" class="search-query span4" placeholder="search...">
				</form>
				<!-- ./ search form -->
			</div>
		</div>
		<!-- end header -->		
		
		<div id="main_content" class="container-fluid">
			<!-- page heading -->
			<div class="blog-heading">
				<div style="display:inline-block;margin-left:200px;">
					<img alt="" src="<%=basePath%>/catalog/images/blog/blogTitle.png">
					<div class="blog-title" style="display:inline-block;font-weight:bold;font-size:20px;">
						尘的世界
					</div>
				</div>
			</div>
			<!--add blog content-->
			<form action="blog/saveBlog" method="post" class="form-horizontal">
				<div class="control-group">
					<label class="control-label" for="inputEmail">标题</label>
					<div class="controls">
						<input type="text" id="inputEmail" name="blogTitle" placeholder="标题">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">内容</label>
					<div class="controls">
						<input type="password" id="inputPassword" name="blogContent" placeholder="Password">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">标签</label>
					<div class="controls">
						<input type="text" id="inputPassword" name="blogTags" placeholder="标签">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">文章分类</label>
					<div class="controls">
						<input type="text" id="inputPassword" name="blogCategory" placeholder="文章分类">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">个人分类</label>
					<div class="controls">
						<input type="text" id="inputPassword" name="myCategory" placeholder="文章分类">
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
					<label class="checkbox">
						<input type="checkbox" class="fancy"> Remember me
					</label>
					<button type="submit" class="btn btn-warning">发布</button>
					</div>
				</div>
			</form>
	
		</div>
		
		
		<!-- base -->
		<script src="<%=basePath%>WB0LRK4D0/library/assets/js/jquery.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/assets/js/bootstrap.min.js"></script>
		
		<!-- addons -->
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/chart-plugins.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jquery-ui-slider.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/redactor/redactor.min.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jmapping/markermanager.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jmapping/StyledMarker.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jmapping/jquery.metadata.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jmapping/jquery.jmapping.min.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jquery.uniform.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/chosen.jquery.min.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/bootstrap-datepicker.js"></script>
		<script src="<%=basePath%>WB0LRK4D0/library/plugins/jquery.timePicker.min.js"></script>
				
		<!-- plugins loader -->
		<script src="library/js/loader.js"></script>
		
		<script type="text/javascript">
		
			function updateBlog(){
				window.location.href=$('#baseUrl').attr("href")+'blog/saveBlog';
			}
		
		</script>
</body>
</html>