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
<h2>项目发布</h2>
<form:form  method="post" modelAttribute="p" action="${pageContext.request.contextPath}/update">
<form:hidden path="id"/>
项目名称: <form:input path="name"/><br>
 所属部门:<form:select path="did" items="${list}" itemLabel="cname" itemValue="did" cssStyle="width:180px"></form:select><br>
 投资金额:<form:input path="amount"/>元<br>
 分管领导:<form:input path="content"/><br><br>
 项目介绍:<form:textarea path="manager"/><br>
 <form:button>发布</form:button>
   </form:form>
</body>
</html>