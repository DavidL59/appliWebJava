<%-- 
    Document   : ajout_serie
    Created on : 21 juin 2016, 10:55:15
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
 <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        
        <div class="contenu">
            <form method="post" >

                <p>
                    <label for="titre">Titre :</label>
                    <input type="text" name="titre" placeholder="Ex : GOT" size="30" maxlength="10" />
                </p>

                <p>
                    <label for="pseudo">Synopsis :</label>
                    <input type="text" name="synopsis" placeholder="Ex : il etait une fois mon histoire..." size="30" maxlength="120" />
                </p>

                <p>
                    <label for=genre>Genre :</label><br />
                    <select name="genre">
                        <c:forEach items="${genres}" var="g">
                            <option value="${g.id}">${g.nom}</option>
                        </c:forEach>
                    </select>
                </p>
                <input type="submit" value="ajouter" />

            </form>
            
        </div>
        
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
        
        
    </body>
</html>
