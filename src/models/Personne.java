package models;

public class Personne{
    //attribut d'instance => propre aux objets
    protected int id;//reel ou entier sont initialiser à O
    protected String nomComplet;//objet est initialiser à null
    protected String email;//bolean est initialiser à false
    protected TypePersonne type;
    
    
    private static int nbr;

    Personne(){
        nbr++;
        id=nbr;
    }
   
    Personne(String nomComplet,String email){
        this.nomComplet=nomComplet;
        this.email=email;
        nbr++;
        id=nbr;
    }
    @Override
    public boolean equals(Object obj) {
        return ((Personne)obj).getId()==this.id;
    }
    @Override
    public String toString() {
        return "id=" + id +"nomComplet="+ nomComplet + "email=" + email ;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public TypePersonne getType() {
        return type;
    }

    public void setType(TypePersonne type) {
        this.type = type;
    }
    public static int getNbr() {
        return nbr;
    }
    public static void setNbr(int nbr) {
        Personne.nbr = nbr;
    }
  
   


   
    
}
