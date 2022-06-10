package models;

public class NonBoursier extends Personne {
   private String adresse ;

public NonBoursier() {
}

public NonBoursier(String nomComplet, String email, String adresse) {
    super(nomComplet, email);
    this.adresse = adresse;
}

public String getAdresse() {
    return adresse;
}

public void setAdresse(String adresse) {
    this.adresse = adresse;
}

@Override
public String toString() {
    return super.toString() + "adresse=" + adresse ;
}
}
