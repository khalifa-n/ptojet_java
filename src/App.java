import java.util.Scanner;

import models.Chambre;
import services.ServiceList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner(System.in);
        ServiceList service = new ServiceList();
        int choix;
        Chambre chambre;
        int numChambre,numEtage;
        do {
            System.out.println("1-Ajouter chambre");
            System.out.println("2-Lister chambre");
            System.out.println("3-Archiver chambre");

            System.out.println("8-Quitter");
            choix=input.nextInt();

            switch (choix) {
                case 1: 
                System.out.println("Entrer le numero de la chambre ");
                numChambre=input.nextInt();
                System.out.println("Entrer le numero de l'etage");
                numEtage=input.nextInt();
                /* chambre=new Chambre();
                chambre.setNumChambre(numChambre);
                chambre.setNumEtage(numEtage); */



                    
                    break;

                case 2:

            
                default:
                System.out.println("veuillez faire un bon choix");

                    break;
            }
             


        } while (condition:var(boolean));
    }
}
