<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">	
	-->	
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<!-- 
	<script type="text/javascript">
	$(function(){
		$("#selectBtn").click(function(){
			
		});
	});	
	</script>
	 -->
  </head>
  
  <body>
   <div>
 		<form action="selectBooks" method="post">
 			类别：<select name="typeId">
 			<option value="0">全部</option>
 				<c:forEach var="btype" items="${btype}">
				<option value="${btype.id}">${btype.name }</option>
 		 		</c:forEach>
   			</select>
   			时间：从<input type="text" name="sTime"/>
   			到<input type="text" name="eTime" />
   			<input type="submit" value="查询" />
 		</form>
 		 <table>
 		 	<tr>
 		 		<th>标题</th>
 		 		<th>时间</th>
 		 		<th>类别</th>
 		 		<th>金额</th>
 		 		<th>说明</th>
 		 	</tr>
 		 	<c:forEach var="b" items="${bills}">
 		 		<tr>
 		 			<td>${b.title}</td>
 		 			<td >
 		 			<fmt:formatDate value="${b.title_time}" pattern="yyyy-MM-dd"/></td>
 		 			<td>${b.name}</td>
 		 			<td>${b.price}元</td>
 		 			<td>${b.explan}</td>
 		 		</tr>
 		 	</c:forEach>
 		 </table>
 		 <!-- 显示系统时间 -->
 		 <%
 		 	java.text.SimpleDateFormat simple=new java.text.SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
 		 	java.util.Date date=new java.util.Date();
 		 	String nowTime=simple.format(date).toString();
 		 	out.println(nowTime);
 		  %><br/>
 		  <!-- 动态刷新时间 -->
 		  <span id="time1">  
                <script type="text/javascript">  
                //动态显示  
                setInterval("document.getElementById('time1').innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",1000);                 
                </script>  
           </span> 
   </div>
  </body>
</html>
