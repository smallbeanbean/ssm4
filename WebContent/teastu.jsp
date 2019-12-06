<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  引入标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${teastu }" var="one">
	教师编号:${one.tid } 教师姓名:${one.tname } 
	<c:forEach items="${one.stu }" var="two">
	学生编号:${two.sid } 学生姓名:${two.sname }
	</c:forEach>
	<br>
	</c:forEach>
</body>
</html>