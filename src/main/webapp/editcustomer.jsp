<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改客户信息</title>
<link rel = "stylesheet" type="text/css" href="bootstrap.min.css">
</head>
<body>
<h1>用户信息</h1>

<s:form action="editcustomer">
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
	
	</button>
<div class="modal" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="tyr">
	
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModallabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<tr> <td align="left" valign="middle" width="40%"><s:textfield name="customers.first_name" label="first_name" /> </td>    </tr>
					<tr> <td align="left" valign="middle" width="40%"><s:textfield name="customers.last_name" label="last_name" /> </td></tr>
					<tr> <td align="left" valign="middle" width="40%"><s:textfield name="customers.email" label="email"/> </td></tr>
					<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">CLose</button>
					<button type="button" class="btn btn-primary">Save</button>
				</div>
				</div>
				
			</div>
		</div>
	</div>
</s:form>
</body>
</html>