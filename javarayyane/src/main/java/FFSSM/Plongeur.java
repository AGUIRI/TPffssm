package FFSSM;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Plongeur extends Personne{
    
    public int Niveau ;
    GroupeSanguin myGroupeSanguin;
    List<Licence> myLicence = new LinkedList<>();

    public Plongeur(int niveau,String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.Niveau=niveau;
    }
    /**
     *
     * @param Niveau
     */

    
    public void ajouteLicence( Licence l) {
            myLicence.add(l);
     }

    Iterable<Licence> getmyLicence() {
        return myLicence;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
	
}
