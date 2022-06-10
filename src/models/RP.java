package models;

public class RP extends Personne {
    private String password;

   

    public RP(String password) {
        this.password = password;
    }



    public RP(String nomComplet, String email, String password) {
        super(nomComplet, email);
        this.password = password;
    }



    public RP() {
        super();
    }

    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }



    @Override
    public String toString() {
        return super.toString() +"password=" + password;
    }
}
