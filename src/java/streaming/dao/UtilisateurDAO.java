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
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {

    public Utilisateur rechercheParLoginEtMdp(String identifiant, String mdp) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query q = em.createQuery("select u from Utilisateur u where u.identifiant=:monLogin and u.mdp=:monMdp");
        q.setParameter("monLogin", identifiant);
        q.setParameter("monMdp", mdp);
        return (Utilisateur) q.getSingleResult();

    }

    public List<Utilisateur> rechercherParLogin(String identifiant) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("select u from Utilisateur u where u.identifiant=:login").setParameter("login", identifiant).getResultList();
    }

    public void ajout(Utilisateur util) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(util);
        em.getTransaction().commit();
    }

}
