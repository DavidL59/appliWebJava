<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : Series_liste
    Created on : 17 juin 2016, 11:16:31
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
            <c:forEach items="${series}" var="serie">
                ${serie.titre}
                  
            </c:forEach>
                
  <table>
   <thead> <!-- En-tête du tableau -->
    <tr>
         <th>Titre</th>
         <th>Genre</th>
         <th>Pays</th>
    </tr>
   </thead>

           <c:forEach items="${series}" var="serie">
        <tr>
           <td><a href="serie_detail?id=${serie.id}">${serie.titre}</a></td>
           <td>${serie.genre.nom}</td>
           <td>
               <c:forEach items="${serie.pays}" var="pays">   
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
