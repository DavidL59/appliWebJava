/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListerLienServlet", urlPatterns = {"/film_detail"})
public class FilmDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        // recup id 
        long idFilm = Long.parseLong(req.getParameter("id"));
        
        // recup film a partir de l'id dao qui gere la bdd > pas de fonction donc on 
        
        Film f = new FilmService().rechercherParId(idFilm);
    
                // set un attribut film
                
                req.setAttribute("film", f);
                
                // foreward vers jsp                
                req.getRequestDispatcher("film_detail.jsp").forward(req, resp);
                
                
    }
    
    


}
