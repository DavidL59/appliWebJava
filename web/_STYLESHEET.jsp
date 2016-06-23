<%-- 
    Document   : _STYLESHEET
    Created on : 17 juin 2016, 10:51:37
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:choose>
    <c:when test="${cookie.styleChoix1==blue}">
<link href="css/Style1.css" rel="stylesheet" type="text/css"/>
    </c:when>
    <c:when test="${cookie.styleChoix2==red}">
<link href="css/Style2.css" rel="stylesheet" type="text/css"/>
    </c:when>
</c:choose>
