package models;

public class Boursier extends Personne {
    private TypeBourse typeBourse;
    private Integer valeur ;
    private Chambre chambre;
    public Boursier() {

    }
    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }
    public Boursier(String nomComplet, String email, TypeBourse typeBourse, int valeur) {
        super(nomComplet, email);
        this.typeBourse = typeBourse;
        this.valeur = valeur;
    }
    public TypeBourse getTypeBourse() {
        return typeBourse;
    }
    public void setTypeBourse(TypeBourse typeBourse) {
        this.typeBourse = typeBourse;
    }
    public int getValeur() {
        return valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    @Override
    public String toString() {
        return super.toString() + "typeBourse=" + typeBourse + ", valeur=" + valeur + "Chambre=" + chambre ;
    }
    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }
    
    
    
}
