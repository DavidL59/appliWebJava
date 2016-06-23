<%-- 
    Document   : _MENU
    Created on : 17 juin 2016, 10:55:00
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="films_liste">Films</a>
<a href="series_liste">Series</a>




<c:choose>
    <c:when test="${cookie.login==null}">
        <a href="pageDeConnexion">connection</a>
        <a href="inscription">Inscription</a>
    </c:when>
        
    <c:otherwise>
        <a href="deconnexion">Deconnection</a>
        <c:if test="${cookie.util_type.getValue()=='ADMIN'}">
                <a href="ajout_film">ajout d'un film</a>
                <a href="ajout_serie">ajout d'une serie</a>
                <a href="ajout_serie">changer style1</a>
                <a href="ajout_serie">changer style2</a>
        </c:if>      
    </c:otherwise>
</c:choose>