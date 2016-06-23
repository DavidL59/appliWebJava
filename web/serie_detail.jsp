<%-- 
    Document   : serie_detail
    Created on : 20 juin 2016, 10:23:06
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

            <h1>Details de : ${serie.titre}</h1>
            <h6>Synopsis : ${serie.synopsis}</h6>
            <p> Réalisé par : </p>
            <c:forEach items="${serie.realisateurs}" var ="real">
                ${real.prenom} ${real.nom},
            </c:forEach>
            <h5>Interpreté par : </h5>

            <c:forEach items="${serie.acteurs}" var ="act">
                ${act.prenom} ${act.nom},
            </c:forEach>


            <c:forEach items="${serie.saisons}" var ="saison">
                ${saison.numSaison} </br>

                
                <c:forEach items="${saison.episodes}" var ="ep">

                    ${ep.id}</br>

                </c:forEach>

            </c:forEach>

        </div>

        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>


    </body>
</html>
