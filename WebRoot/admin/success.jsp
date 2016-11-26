<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
request.setAttribute("path",path);
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>admin login success</h1>
    <br/>
    <a href="${path}/company_showPage?formCompany.cisverify=0">查看未验证公司</a>
    <br/>
    <a href="${path}/company_showPage?formCompany.cisverify=1">查看已验证公司</a>
    <br/>
    <a href="${path}/student_showPage?formStudent.employee=1">查看已就业学生</a>
    <br/>
    <a href="${path}/student_showPage?formStudent.employee=0">查看未就业学生</a>
    <br/>
    <a href="${path}/student_importAcount">导入学生账号</a>
  </body>
</html>
