/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;
    
    List<Plongeur> myPlongeur = new LinkedList<>();

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
    }

    public void ajouteParticipant(Plongeur participant) {
         // TODO: Implémenter cette méthode
        myPlongeur.add(participant);;	    
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
         // TODO: Implémenter cette méthode
        for (Plongeur p: myPlongeur){
            for(Licence l: p.getmyLicence()){
                if(l.estValide(date) == false)
                    return false;                    
            }
        }
        return true;
    
            
    }

}
