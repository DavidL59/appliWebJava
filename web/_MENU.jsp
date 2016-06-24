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
    <c:when test="${utilConnecte.identifiant==null}">
        <a href="pageDeConnexion">connection</a>
        <a href="inscription">Inscription</a>
    </c:when>
        
    <c:otherwise>
        <a href="deconnexion">Deconnection</a>
        <c:if test="${utilConnecte.utiltype=='ADMIN'}">
                <a href="ajout_film">ajout d'un film</a>
                <a href="ajout_serie">ajout d'une serie</a>
        </c:if>      
    </c:otherwise>        
</c:choose>
                
                <a href="change_style?style=style1">changer style1</a>
                <a href="change_style?style=style2">changer style2</a>