/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenresService2 {
 
    public List<Genre> lister(){
        return new GenreDAO().lister();
    }
    
    public Genre rechercherParId(long genreID){
        return new GenreDAO().rechercherParId(genreID);
    }
    
    public void supprimer(long id){
        new GenreDAO().supprimer(id);
    }
    
    public void modifier(Genre genre){
        new GenreDAO().modifier(genre);
    }
    
    public void ajouter(Genre g){
        new GenreDAO().modifier(g);
    }
}
