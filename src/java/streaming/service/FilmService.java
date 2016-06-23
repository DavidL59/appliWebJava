/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmService {
    
    public Film rechercherParId(long id){
       
        FilmDAO dao = new FilmDAO();
        return dao.rechercherParId(id);
        
    }
    
    public List<Film> lister(){
        FilmDAO dao = new FilmDAO();
        return dao.listerTous();
    }

    public void ajouter(Film f) {
        new FilmDAO().ajouter(f);
    }

    public void modifier(Film film){
        new FilmDAO().modifier(film);
    }
    
    public void supprimer(long id){
        new FilmDAO().supprimer(id);
    }
    
}
