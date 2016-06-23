
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : Films_liste
    Created on : 17 juin 2016, 11:15:59
    Author     : admin
--%>

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
            <h1> Liste des films</h1>

  <table border = "1">
      
   <thead>
    <tr>
         <th>Titre</th>
         <th>Annee</th>
         <th>Genre</th>
         <th>Pays</th>
    </tr>
   </thead>
   
     
         <c:forEach items="${films}" var="film">
       <tr>
           
           <td><a href="film_detail?id=${film.id}">${film.titre}</a></td>
           <td>${film.annee}</td>
           <td>${film.genre.nom}</td>
           <td>
                    <c:forEach items="${film.pays}" var="pays">   
                     ${pays.nom}
                    </c:forEach>
            </td>
        
       </tr>
       </c:forEach>
  
 
</table>         
            
            
            
            
        </div>
        
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
        
    </body>
</html>