/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;


import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenresService2;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutServlet", urlPatterns = {"/ajout_film"})
public class AjoutFilmServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       
       // recup genre
       long genreId= Long.parseLong(req.getParameter("genre"));
       Genre genre = new GenresService2().rechercherParId(genreId);
       
       //construit un film a partir de l'ecran precedent'
       Film f = new Film();       
       f.setTitre(req.getParameter("titre")); 
       genre.getFilms().add(f);
       f.setGenre(genre);

       // persiste
       new FilmService().ajouter(f); 
       // forward vers liste film 
      resp.sendRedirect("films_liste");      

}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Genre> listGenre = new GenresService2().lister();
        
        req.setAttribute( "genres", listGenre);
        
        // forward vers jsp
        
        req.getRequestDispatcher("ajout_film.jsp").forward(req, resp);
    }
}
