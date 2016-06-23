/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.LienDAO;
import streaming.entity.Lien;


/**
 *
 * @author admin
 */
public class LienService {
    
    public void supprimer(long id){
        new LienDAO().supprimer(id);
    }
    
    public void ajouter(Lien l){
        new LienDAO().ajouter(l);
    }
    
    public Lien rechercherParId(long id){
        return new LienDAO().rechercherParId(id);
    }
    
    public List<Lien> lister() {
       return new LienDAO().listerTous();
    }
    
    public void modifier(Lien lien){
        new LienDAO().modifier(lien);
    }
}
