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
        chambre.setPavillon(pavillon);
                //pavillon vers chambre
        pavillon.getChambres().add(chambre);
        bdChambres.add(chambre);     

    }

    

    @Override
    public Chambre rechercherChambre(int id) {
        Chambre ch = new Chambre(id);

        for (Chambre chambre : bdChambres) {
            if (chambre.equals(ch)) {
                return chambre;
            }
    }
    return null;
}

    @Override
    public void modifierChambre(Chambre chambre) {
        for (int index = 0; index < bdChambres.size(); index++) {
            if ( bdChambres.get(index).equals(chambre)) {
                bdChambres.set(index, chambre);
            }
        }        
    }

    @Override
    public void listerChambre() {
           for (Chambre chambre : bdChambres) {
               System.out.println(chambre);
           }
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        bdPavillons.add(pavillon);        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon, ArrayList<Chambre> chambres) {
                bdPavillons.add(pavillon);
                pavillon.getChambres().addAll(chambres);
                bdPavillons.add(pavillon);
    }

    @Override
    public Pavillon rechercherPavillon(int id) {
        Pavillon pav= new Pavillon(id);
        for (Pavillon pavillon : bdPavillons) {
            if (pavillon.equals(pav)) {
                return pavillon;
            }
        }
        return null ;
    }

    @Override
    public void modifierPavillo(Pavillon pavillon) {
        for (int i = 0; i < bdPavillons.size(); i++) {
            if (bdPavillons.get(i).equals(pavillon)) {
                bdPavillons.set(i, pavillon);
            }
        }        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : bdPavillons) {
            System.out.println(pavillon);
        }        
    }

    @Override
    public void archiverPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    
}
