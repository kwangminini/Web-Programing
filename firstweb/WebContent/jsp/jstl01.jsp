<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%request.setAttribute("score", 10); %>
<%
	List<String> list = new ArrayList<>();
	list.add("hello");
	list.add("world");
	list.add("!!!");
	request.setAttribute("list", list);
%>
<c:set var="value1" scope="request" value="kang"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�� : ${value1}<br>
<c:remove var="value1" scope="request"/>
�� : ${value1 }
<c:if test="${n==0}">n�� 0�� �����ϴ�</c:if>
<c:if test="${n==10 }">n�� 10�� ����.</c:if>
<c:choose>
	<c:when test="${score==10 }">score=10</c:when>
	<c:otherwise>�ٸ�����</c:otherwise>
</c:choose>
<c:forEach items="${list}" var="item">${item }</c:forEach>
</body>
</html>