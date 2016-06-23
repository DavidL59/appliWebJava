/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Genre;
import streaming.entity.Serie;
import streaming.service.GenresService2;
import streaming.service.SerieService;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutSerieServlet", urlPatterns = {"/ajout_serie"})
public class AjoutSerieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
          
       // recup genre
       long genreId= Long.parseLong(req.getParameter("genre"));
       Genre genre = new GenresService2().rechercherParId(genreId);
       
       //construit un film a partir de l'ecran precedent'
       Serie s = new Serie();       
       s.setTitre(req.getParameter("titre"));
       s.setSynopsis(req.getParameter("synopsis"));
       genre.getSeries().add(s);
       s.setGenre(genre);

       // persiste
       new SerieService().ajouter(s); 
       // forward vers liste film 
      resp.sendRedirect("series_liste");      
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         List<Genre> listGenre = new GenresService2().lister();
        
        req.setAttribute( "genres", listGenre);
        
        // forward vers jsp
        
        req.getRequestDispatcher("ajout_serie.jsp").forward(req, resp);
    }


}
