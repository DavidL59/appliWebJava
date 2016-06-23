/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Utilisateur;
import streaming.service.UtilisateurService;

/**
 *
 * @author admin
 */
@WebServlet(name = "pageInscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // form binding > prendre input et les metre dans un objet utilisateur
       String login = req.getParameter("login");
       String mail = req.getParameter("mail");
       String mdp = req.getParameter("mdp");
       
       Utilisateur u= new Utilisateur();
       u.setIdentifiant(login);
       u.setEmail(mail);
       u.setMdp(mdp);
       
       // gere inscription
        UtilisateurService utilService = new UtilisateurService();
        utilService.inscription(u);
        
        resp.sendRedirect("home");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("inscription.jsp").forward(req, resp);
    }

 
}
