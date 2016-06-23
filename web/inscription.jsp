<%-- 
    Document   : inscription
    Created on : 22 juin 2016, 11:22:58
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

            <h1>Formulaire pour une nouvelle inscription</h1>
            <h2>Veuillez remplir les champs indiqués ci-dessous</h2>

            <form method="post" >

                <p>
                    <label for="pseudo">login :</label>
                    <input type="text" name="login" placeholder="Ex : jamesBond" size="30" maxlength="10" />
                </p>

                <p>
                    <label for="pseudo">Email :</label>
                    <input type="text" name="mail" placeholder="Ex : toto@hotmail.com" size="30" maxlength="10" />
                </p>

                <p>
                    <label for="pseudo">mot de passe :</label>
                    <input type="text" name="mdp" placeholder="" size="30" maxlength="10" />
                </p>
                <input type="submit" value="envoyer" />

            </form>

        </div>

        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>


    </body>
</html>
