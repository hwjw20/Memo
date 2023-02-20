<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
		<header class="d-flex justify-content-between align-items-center">
			<h1 class="pl-2">Memo</h1>
			<%-- 세션에 "userId"라는 키에 값이 있다면 로그인된 상태 --%>
			<c:if test="${not empty userId}">
				<div class="mr-3">${userName}님 <a href="/user/signout">로그아웃</a><i class="bi bi-box-arrow-right ml-1"></i></div>
			</c:if>
		</header>