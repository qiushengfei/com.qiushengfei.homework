<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<body>
<form class="form-inline" style="margin-top: 30px" id="fid">
 
  <div class="form-group mx-sm-3 mb-2">
    <input type="text" class="form-control" name="name" value="${p.name}" placeholder="按项目名称查找">
  </div>
  <button type="submit" class="btn btn-primary mb-2" onclick="likes"> 查找</button>
</form>
<input type="button" class="btn btn-primary" onclick="add()" value="项目发布">
<input type="button" class="btn btn-primary" onclick="del()" value="批量删除">
<table class="table" style="margin-left: 20px">
<tr>
<th><input type="button" class="btn btn-primary" value="全选" onclick="qx()">
<input type="button" class="btn btn-primary" value="反选" onclick="fx()">
<input type="button" class="btn btn-primary" value="全不选" onclick="qbx()">
 </th>
	<th>主键</th>
	<th>项目名称</th>
	<th>投资金额</th>
	<th>分管领导</th>
	<th>部门</th>
	<th>操作</th>

</tr>
<c:forEach items="${info.list}" var="a">
<tr>
<td><input type="checkbox" name="ck" value="${a.id}"> </td>
	<td>${a.id}</td>
	<td>${a.name}</td>
	<td>${a.amount}</td>
	<td>${a.content}</td>
	<td>${a.cname}</td>
<td>  <a href="${pageContext.request.contextPath}/seleceById?id=${a.id}" >查看详情</a> 
<a href="${pageContext.request.contextPath}/updateByid?id=${a.id}" >修改</a> </td>
</tr>
</c:forEach>


</table>
<div style="widows: 1000px;height: 60px;text-align: center;">
	<nav aria-label="..." style="margin-left: 1200px"> 
<jsp:include page="/WEB-INF/views/pages.jsp"></jsp:include>
</nav>

</div>

</body>
<script type="text/javascript">
function goPage(page){
	location="${pageContext.request.contextPath}/list?page="+page+"&"+$("#fid").serialize();
}
function likes(){
	location="${pageContext.request.contextPath}/list"+$("#fid").serialize();
}
function add(){
	location="${pageContext.request.contextPath}/add";
}
function qx(){
	$("[name='ck']").each(function(){
		this.checked=true;
	})
}
function qbx(){
	$("[name='ck']").each(function(){
		this.checked=false;
	})
}
function fx(){
	$("[name='ck']").each(function(){
		this.checked=!this.checked;
	})
}
function del(){
	var ids=$("[name='ck']:checked").map(function(){
		return this.value;
	}).get().join();
	//alert(ids);
	if(confirm("确定删除这些数据?")){
		$.ajax({
			url:"${pageContext.request.contextPath}/del",
			data:{"ids":ids},
			type:"post",
			success:function(i){
				if(i>0){
					alert("删除成功");
					location="${pageContext.request.contextPath}/list";
				}else{
					alert("删除失败");
				}
				
			}
		})
	}
	
}
</script>
</html>