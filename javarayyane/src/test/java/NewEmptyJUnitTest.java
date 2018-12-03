/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FFSSM.Club;
import FFSSM.Licence;
import FFSSM.Moniteur;
import FFSSM.Plongee;
import FFSSM.Plongeur;
import FFSSM.Site;
import java.util.Calendar;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;




/**
 *
 * @author raguiri
 */
public class NewEmptyJUnitTest {
    Plongeur  Mohamet,KAMDOM;
    Moniteur Aguiri, Kevin;
    Club Castres;
    Site toulouse;
    Plongee Pl1;
    Licence licenceV ,licenceNV;
    
    
    @Before
    
    public void setUp(){
        Mohamet=new Plongeur(1,"P1","KONE","Mohamet","dakar","1111",Calendar.getInstance());
        
        KAMDOM=new Plongeur(2,"P2","KAMDOM","merveille","dakar","1112",Calendar.getInstance());
         
        Aguiri= new Moniteur ("P3","Aguiri","Rayyane","Maroc","1113",Calendar.getInstance(),2);
        Kevin= new Moniteur ("P4","Kevin","Cadric","dakar","1114",Calendar.getInstance(),2);
        
        Castres = new Club (Kevin,"Castres","1114");
        
        Calendar cal= Calendar.getInstance();
        cal.set(2017,5,25);
        
        Calendar date =Calendar.getInstance();
        date.set(2018,10,29);
        
        toulouse=new Site("Toulouse","propre");
        
        Pl1=new Plongee(toulouse,Aguiri,date,16,12);
        
        Calendar dateLV =Calendar.getInstance();
        dateLV.set(2018,10,28);
        
        licenceV=new Licence(Mohamet,"L1",date,2,Castres);
        
        Calendar dateLNV=Calendar.getInstance();
        dateLNV.set(2017,10,28);
        
        licenceNV=new Licence (Mohamet,"L1",dateLNV,2,Castres);
        
        
    }
    
    
    @Test
    public void testPlongeeConforme(){
        
        Pl1.ajouteParticipant(Mohamet);
        Pl1.ajouteParticipant(KAMDOM);
        
        Mohamet.ajouteLicence(licenceV);
        KAMDOM.ajouteLicence(licenceV);
        
        Mohamet.ajouteLicence(licenceNV);
        KAMDOM.ajouteLicence(licenceV);
        
        assertFalse(Pl1.estConforme());
        
    }  
    
    
    @Test
    public void testEmbauche(){
        Calendar  dateDE=Calendar.getInstance();
        dateDE.set(2017,10,28);
        
        Aguiri.nouvelleEmbauche(Castres, dateDE);
        
        assertFalse(Aguiri.emplois().get(Aguiri.emplois().size()-1).estTerminee());
        
        Aguiri.emplois().get(Aguiri.emplois().size()-1).terminer(Calendar.getInstance());
        
        assertTrue(Aguiri.emplois().get(Aguiri.emplois().size()-1).estTerminee());
        
    }
    
    @Test
    public void testClub(){
        
        Pl1.ajouteParticipant(Mohamet);
        Pl1.ajouteParticipant(KAMDOM);
        
        Mohamet.ajouteLicence(licenceNV);
        KAMDOM.ajouteLicence(licenceV);
        
        Castres.organisePlongee(Pl1);
        
        assertFalse(Castres.plongeesNonConformes().isEmpty());
        
    }
    
}    
    
    
   
        
   
    
   
        
        
     
        
        
   
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
