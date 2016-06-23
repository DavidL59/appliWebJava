/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.FilmDAO;
import streaming.dao.SerieDao;
import streaming.entity.Film;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {

    public Serie rechercherParId(long id) {
        SerieDao dao = new SerieDao();
        return dao.rechercherParId(id);
    }

    public List<Serie> lister() {
        SerieDao dao = new SerieDao();
        return dao.listerTous();
    }

    public void ajouter(Serie s) {
        new SerieDao().ajouter(s);
    }
    
    public void modifier(Serie serie){
        new SerieDao().modifier(serie);
    }
    public void supprimer(long id){
        new SerieDao().supprimer(id);
    }
}
