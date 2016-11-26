<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    
		<form action="${pageContext.request.contextPath}/company_regist.action" method="post" onsubmit="return(checkpass());">
			
			账号<input type="text" name="formCompany.cusername" /> <br/>
			密码<input type="password" id="formCompany.cpassword" name="formCompany.cpassword" /> <br/>
			确认密码<input type="password2" id="cpassword2" name="cpassword2" /> <br/>
			公司名称<input type="text" name="formCompany.ccompanyname" /> <br/>
			公司注册号<input type="text" name="formCompany.ccompanynumber" /> <br/>
			
			验证码<input type="text" name="verifyCode">
			<img  src="${pageContext.request.contextPath}/captcha.action" />
			<input type="submit" value="登陆"  />
		</form>

	<script>
		function checkpass(){
			var pass1 = document.getElementById("formCompany.cpassword").value;
			var pass2 = document.getElementById("cpassword2").value;
			if(pass1 === pass2){
				return true;
			}else{
				alert("两次输入密码不一致" + pass1 + ':' + pass2);
				return false;
			}	
		}
	</script>
  </body>
</html>
