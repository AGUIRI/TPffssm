/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Personne {

    public int numeroDiplome;
    public List<Embauche> myEmbauche = new LinkedList<>();
    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    public Club employeur() {
         // TODO: Implémenter cette méthode
         Embauche e=myEmbauche.get(myEmbauche.size()-1);
        if (e.estTerminee()== false){
            return e.getEmployeur();
        }
        return null;
        
                
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {   
         // TODO: Implémenter cette méthode
        Embauche e = new Embauche (debutNouvelle,this,employeur);
                myEmbauche.add(e);
                
        
        
    }

    public List<Embauche> emplois() {
         // TODO: Implémenter cette méthode
         List<Embauche> myEmbauche = new LinkedList<>();
         return myEmbauche;
    }
}
