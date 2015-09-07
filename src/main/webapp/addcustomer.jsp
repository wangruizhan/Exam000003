<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>增加新用户</title>



</head>
<body>
<h1>新用户信息</h1>
<s:form action="addcustomer" >
<table width="240" border="1">

<tr><td><s:textfield name="first_name" label="first_name" id="first_name"/> </td></tr>
<tr><td><s:textfield name="last_name" label="last_name" id="last_name"/> </td></tr>
<tr><td><s:textfield name="email" label="Email" id="email"/> </td></tr>
<s:set name="addressList" value="{'斗破','凡人修仙','吞噬'}"/>
<s:select label="Address" list="#addressList"/>
<tr><td><s:textfield name="address" label="Address" id="address"/> </td></tr>

<tr><td><s:submit value="新建" /></td><td><s:submit value="取消" /></td></tr>
</table>
</s:form>
</body>
</html>