<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>客户列表</title>
</head>
<body>
<table width="60%" border="1" >
	<s:form action="listcustomers" method="post">
	h2><a href="addcustomer.jsp">新建</a></h2>
	<tr>
		<th>操作</th>
		<th>First_name</th>
		<th>Last_name</th>
		<th>address</th>
		<th>Email</th>
		<th>Customer_id</th>
		<th>Last_update</th>

	</tr>
	<s:iterator value="customers"  status="stuts"><!-- 此处自动调用ViewUserAction.getUsers()方法-->
	<s:if test="#stuts.odd == true">
         <tr bgcolor="#35FF68">
    </s:if>
     <s:else><tr bgcolor="#B9EA99"> 
     </s:else>
     		<td><a href="loadcustomer.action?id=<s:property value="id" />" >编辑</a>|<a href="deleteuser.action?id=<s:property value="id"/>" >删除</a></td>
			<td><s:property value="first_name" /></td>
			<td><s:property value="last_name" /></td>
			<td><s:property value="address"/></td>
			<td><s:property value="email" /></td>
			<td><s:property value="customer_id" /></td>
			<td><s:property value="last_update" /></td>
		</tr>
	</s:iterator>
	</s:form>
</table>
<br>
<h2><a href="adduser.jsp">增加新用户</a></h2>
</body>
</html>