<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'companyShow.jsp' starting page</title>
    
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
   	<strong>公司账户 ： 公司名称 : 公司注册号</strong>
   	<br/>
    <s:iterator value="%{#page.page}" var="bean">
    	 ${bean.cusername} : ${bean.ccompanyname} : ${bean.ccompanynumber} : 
    	 <s:a href="company_activeCompany.action?formCompany.cid=%{#bean.cid}">通过审核</s:a>
    	 <s:a href="company_deleteCompany.action?formCompany.cid=%{#bean.cid}" onclick="return(show_confirm())">删除</s:a>
    	<br/>
    </s:iterator>
    
    	第 ${page.currentPage } 页 / 共 ${page.pageCount } 页
    <s:a href="company_showPage.action?nowPage=1&attrUrl=%{#page.attrUrl}">首页</s:a>
    <s:if test="%{#page.currentPage > 1 }"><s:a href="company_showPage.action?nowPage=%{#page.currentPage - 1}&attrUrl=%{#page.attrUrl}">上一页</s:a></s:if>
    
    <s:iterator begin="%{#page.start}" end="%{#page.end}" var="i">
    	<s:if test="%{#page.currentPage == #i}"><strong> <s:a href="company_showPage.action?nowPage=%{#i}&attrUrl=%{#page.attrUrl}">${i }</s:a> </strong></s:if>
    	<s:else> <s:a href="company_showPage.action?nowPage=%{#i}&attrUrl=%{#page.attrUrl}">${i }</s:a> </s:else>
    </s:iterator>
    
    
    <s:if test="%{#page.currentPage < #page.pageCount }"><s:a href="company_showPage.action?nowPage=%{#page.currentPage + 1}&attrUrl=%{#page.attrUrl}">下一页</s:a></s:if>
    <s:a href="company_showPage.action?nowPage=%{#page.pageCount}&attrUrl=%{#page.attrUrl}">尾页</s:a>
    
    <script>
    	function show_confirm(){
    		var result = confirm("确认删除该该申请？");
    		if( true == result){
    			return true;
    		}else{
    			return false;
    		}
    	}
    </script>
  </body>
</html>
