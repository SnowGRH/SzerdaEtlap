
package model;


public class Etel {
    private String neve;
    private int ar;

    public Etel(String neve, int ar) {
        this.neve = neve;
        this.ar = ar;
    }
    public Etel(String sor){
       String[] split = sor.split("\\|");
       this.neve = split[0];
       this.ar = Integer.valueOf(split[1]);
    }
    public String getNeve() {
        return neve;
    }

    public int getAr() {
        return ar;
    }

    
}
