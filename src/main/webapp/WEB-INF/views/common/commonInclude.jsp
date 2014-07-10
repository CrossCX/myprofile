<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String ctxPath = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ctxPath+"/";
	long currentTime = System.currentTimeMillis();
	String SYSTEM_NAME = "尘媒体平台";
	String SYSTEM_COPYRIGHT = "&copy; 2013. XXX. All Rights Reserved. ";
%>