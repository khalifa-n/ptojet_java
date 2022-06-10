package services;

import java.util.ArrayList;

import models.Chambre;
import models.Pavillon;

public class ServiceList implements IService {
    ArrayList<Chambre> bdChambres = new ArrayList<>();
    ArrayList<Pavillon> bdPavillons = new ArrayList<>();


    @Override
    public void ajouterChambre(Chambre chambre) {
        bdChambres.add(chambre);     
    }

    @Override
    public void ajouterChambre(Chambre chambre, Pavillon pavillon) {
        //affecter une chambre a un pavilon
        
        //pavillon vers chambre
        
        bdChambres.add(chambre);     

    }

    

    @Override
    public Chambre rechercherChambre(int id) {
        for (Chambre chambre : bdChambres) {
            Chambre ch = new Chambre();
            if (chambre.equals(ch()) {
                return chambre;
            }
            
        }
        return null;
    }

    @Override
    public void modifierChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerChambre() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon, ArrayList<Chambre> chambres) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Chambre rechercherPavillon(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void modifierPavillo(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void archiverPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    
}
