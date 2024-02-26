package model;

import java.util.ArrayList;


public class Asztal {

    private String szin;
    private ArrayList<Etel> rendelesek;

    public Asztal(String szin, ArrayList<Etel> rendelesek) {
        this.szin = szin;
        this.rendelesek = rendelesek;
    }

    public String getSzin() {
        return szin;
    }

    public ArrayList<Etel> getRendelesek() {
        return rendelesek;
    }
    public void vegOsszeg(){
        
    }

    
}


