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
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienDAO {
    
    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();        
        em.getTransaction().begin();
        Lien l = em.find(Lien.class, id);
        em.remove(l);
        em.getTransaction().commit();
    }
    
    public void modifier(Lien lien) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();        
        em.getTransaction().begin();
        em.merge(lien);
        em.getTransaction().commit();
    }
    
    public Lien rechercherParId(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();        
        return em.find(Lien.class, id);
    }
    
    public List<Lien> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();        
        return em.createQuery("select l from Lien l").getResultList();
    }
    
    public void ajouter(Lien l) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();        
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
}
