<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
</head>
<body>
<div align="center">
	<form
		action="${pageContext.request.contextPath }/itemInsert.action"
		method="get">
		名称：<input type="text" name="name" " style="width: 1000px"/>
		<br>
		价格：<input type="text" name="price" " style="width: 1000px"/>
		<br>
<%-- 		日期：<input type="text" name="createtime" value="${item.createtime}" style="width: 1000px"/>
		<br> --%>
		描述：<input type="text" name="detail"  style="width: 1000px"/>
		<br>
		<input type="submit" value="添加">
		<input type="reset" value="重置">
	</form>
</div>
</body>
</html>