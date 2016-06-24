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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "Deconnexion", urlPatterns = {"/deconnexion"})
public class DeconnexionServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie c;
//
//        c = new Cookie("login", null);
//        c.setMaxAge(0);
//        resp.addCookie(c);
//
//        c = new Cookie("mdp", null);
//        c.setMaxAge(0);
//        resp.addCookie(c);
//
//        c = new Cookie("util_type", null);
//        c.setMaxAge(0);
//        resp.addCookie(c);

        req.getSession().removeAttribute("utilConnecte");
        
        resp.sendRedirect("films_liste");
        
    }
    
}
