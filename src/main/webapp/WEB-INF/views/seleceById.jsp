<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>投资项目详情</h2>
<form:form modelAttribute="p">
   项目名称:${p.name}<br>
   投资金额:${p.amount}<br>
   分管领导:${p.content}<br>
   所属部门:${p.cname}<br>
   项目说明:${p.manager}<br>
</form:form>
</body>
</html>