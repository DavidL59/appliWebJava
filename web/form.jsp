<%-- 
    Document   : form
    Created on : 17 juin 2016, 09:41:37
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>formulaire</h1>
        
<form method="post" >

    <p>
        <label for="pseudo">Titre :</label>
        <input type="text" name="titre" placeholder="Ex : james bond" size="30" maxlength="10" />
    </p>
    
     <p>
        <label for="pseudo">Annee prod :</label>
        <input type="text" name="anneeProd" placeholder="Ex : 1995" size="30" maxlength="10" />
    </p>
    
    <p>
       <label for=genre>Genre ?</label><br />
       <select name="genre" >
           <option value="f">horreur</option>
           <option value="e">sf</option>
           <option value="i">policier</option>
       </select>
   </p>
   
   <p>
       <label for="pays">Pays ?</label><br />
       <select name="pays" >
           <option value="france">France</option>
           <option value="espagne">Espagne</option>
           <option value="italie">Italie</option>
       </select>
   </p>
   
   <input type="submit" value="ajouter" />

</form>
    </body>
</html>
