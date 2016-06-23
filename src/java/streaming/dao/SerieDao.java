/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieDao {

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Serie s = em.find(Serie.class, id);
        em.remove(s);
        em.getTransaction().commit();
    }

    public List<Serie> listerTous() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("select s from Serie s ").getResultList();
    }

    public Serie rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.find(Serie.class, id);

    }

    public void ajouter(Serie s) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();

    }
    
    public void modifier(Serie serie){
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager(); 
         em.getTransaction().begin();
         em.merge(serie);
         em.getTransaction().commit();
    }
}
