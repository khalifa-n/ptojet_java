package models;

import java.util.ArrayList;

public class Chambre {

    private int id;
    private int numChambre;
    private int numEtage;
    private EtatChambre etat;
    private TypeChambre typeChambre;
    private ArrayList <Boursier> boursiers = new ArrayList<>();
    private Pavillon pavillon;
    private static int nbr;

    public ArrayList<Boursier> getBoursiers(){
        return boursiers;
    }
    public TypeChambre getTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }
    public Chambre() {
        nbr++;
        id=nbr;
        etat=EtatChambre.DISPONIBLE;

    }
    
    public EtatChambre getEtat() {
        return etat;
    }
    public void setEtat(EtatChambre etat) {
        this.etat = etat;
    }
    public Chambre(int numChambre, int numEtage) {
        this.numChambre = numChambre;
        this.numEtage = numEtage;
        nbr++;
        id=nbr;
        etat=EtatChambre.DISPONIBLE;
    }
    public Pavillon getPavillon() {
        return pavillon;
    }
    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumChambre() {
        return numChambre;
    }
    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }
    public int getNumEtage() {
        return numEtage;
    }
    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }
    @Override
    public boolean equals(Object obj) {
        return ((Chambre)obj).getId()==this.id;
    }
    @Override
    public String toString() {
        return "id=" + id + ", numChambre=" + numChambre + ", numEtage=" + numEtage ;
    }

    
}