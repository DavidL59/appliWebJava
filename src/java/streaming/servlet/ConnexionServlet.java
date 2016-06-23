/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "Connexion", urlPatterns = {"/pageDeConnexion"})
public class ConnexionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //recupere le login et mdp et stocke valeurs dans variables 
       String login= req.getParameter("login");
       String mdp = req.getParameter("pwd");
       
       UtilisateurService utilService = new UtilisateurService();
       Utilisateur util = utilService.rechercheParLoginEtMdp(login, mdp);
       
       resp.addCookie(new Cookie("login", login));
       resp.addCookie(new Cookie("mdp", mdp));
       resp.addCookie(new Cookie("util_type", util.getUtiltype().toString()));
       //redirige vers la liste des films une fois authentifier 
       resp.sendRedirect("films_liste?connecte=vrai");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        req.getRequestDispatcher("pageDeConnexion.jsp").forward(req, resp);
                
        
    }



}
