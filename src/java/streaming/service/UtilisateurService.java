/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.UtilisateurDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {
    
        public Utilisateur rechercheParLoginEtMdp(String identifiant, String mdp){
       
        UtilisateurDAO dao = new UtilisateurDAO();
        return dao.rechercheParLoginEtMdp(identifiant, mdp);
        
    }
    
        public void inscription(Utilisateur util){
            // trhow exception si login existe
            
            UtilisateurDAO dao = new UtilisateurDAO();
            
            List<Utilisateur> listeUtilAvecCeLogin = dao.rechercherParLogin(util.getIdentifiant());
            
            if(listeUtilAvecCeLogin.size()>0){
            throw new RuntimeException("ce login n'existe pas");
        }
            
            // passe l'util a un etat non valide
            util.setEtatUtil(Utilisateur.EtatUtil.NON_VALIDE);
            
            // persiste
            dao.ajout(util);
            
            new MailService().envoyerMail(util.getEmail(), "inscription", "veuillez vous inscrire");
                    
        }
}
