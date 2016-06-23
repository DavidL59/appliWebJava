
package streaming.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/serie_detail"})
public class SerieDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             // recup id 
        long idSerie = Long.parseLong(req.getParameter("id"));
        
        // recup serie a partir de l'id dao qui gere la bdd > pas de fonction donc on 
        
        Serie s = new SerieService().rechercherParId(idSerie);
    
                // set un attribut serie
                
                req.setAttribute("serie", s);
                
                // foreward vers jsp                
                req.getRequestDispatcher("serie_detail.jsp").forward(req, resp);
    }

}
