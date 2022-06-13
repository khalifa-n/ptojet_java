package models;

import java.util.ArrayList;

public class Pavillon {
    private int id;
    private int num;
    private int nbrEtage;
    private static int nbr;
    private ArrayList<Chambre> chambres=new ArrayList<>();
    public Pavillon(int id) {
        this.id = id;
    }
    public Pavillon() {
        nbr++;
        id=nbr;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Pavillon(int num, int nbrEtage) {
        this.num = num;
        this.nbrEtage = nbrEtage;
        nbr++;
        id=nbr;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNbrEtage() {
        return nbrEtage;
    }
    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }
    @Override
    public String toString() {
        return "chambres=" + chambres + ", id=" + id + ", nbrEtage=" + nbrEtage + ", num=" + num ;
    }
    public ArrayList<Chambre> getChambres() {
        return chambres;
    }
    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }
    @Override
    public boolean equals(Object obj) {
       return ((Pavillon)obj).getId()==this.id;

    }
    
}
