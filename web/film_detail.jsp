<%-- 
    Document   : film_detail
    Created on : 17 juin 2016, 16:25:45
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        
        <div class="contenu">
            
            <h1>Details de : ${film.titre}</h1>
            <h6>Synopsis : ${film.synopsis}</h6>
            <p> Réalisé par : </p>
            <c:forEach items="${film.realisateurs}" var ="real">
                       ${real.prenom} ${real.nom},
             </c:forEach>
            <h5>Interpreté par : </h5>
            
             <c:forEach items="${film.acteurs}" var ="act">
                       ${act.prenom} ${act.nom},
             </c:forEach>
            <p>lien 1 : </p>
             <c:forEach items="${film.liens}" var ="lien">
                 ${lien.langue} ${lien.qualite} <a href="${lien.url}"> voir en streaming</a>
                 </br>
             </c:forEach>
           
        </div>
        
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
        
    </body>
</html>