/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmDAO {
    
    
    public void modifier(Film film){
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); 
         em.getTransaction().begin();
         em.merge(film);
         em.getTransaction().commit();
    }
    
    public void supprimer(long id){
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); 
         em.getTransaction().begin();
         Query q =em.createQuery("delete from Film f where id=:idFilm");
         q.setParameter("idFilm", id);
         q.executeUpdate();
         
         // les 3 lignes du dessus peuvent etre remplacé par 
         // Film f = em.find(Film.class, id);
         // em.remove(f);
         em.getTransaction().commit();
    }
    
    // fonction cree car n'exister pas avant pour recuperer
    public Film rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); 
        
        return em.find(Film.class,id);
        
    }
    
    public List<Film> listerTous(){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); 
        
        return em.createQuery("select f from Film f ").getResultList();
    }

    public void ajouter(Film f) {
        
EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); 
           em.getTransaction().begin();
           em.persist(f);
           em.getTransaction().commit();
        
    }

  
}
