package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Etterem {

    public static final String HUF = "FT";
    private ArrayList<Asztal> asztalok = new ArrayList<>();
    private ArrayList<Etel> etlap = new ArrayList<>();

    public Etterem() throws IOException {
        feltoltesAsztal();
        feltoltesEtlap();
    }

    public Etterem(ArrayList<Asztal> asztalok, ArrayList<Etel> etlap) {
        this.asztalok = asztalok;
        this.etlap = etlap;
    }

    public List<Asztal> getAsztalok() {

        return Collections.unmodifiableList(asztalok);
    }

    public List<Etel> getEtlap() {
        return Collections.unmodifiableList(etlap);
    }

    private ArrayList<Etel> feltoltesEtlap() throws IOException {
        File file = (File) Files.readAllLines(Path.of("etlap.txt"));
        Scanner etlapfile = new Scanner(file);
        while (etlapfile.hasNextLine()) {
            String data = etlapfile.nextLine();
            Etel etla = new Etel(data);
        }
        etlapfile.close();
        return etlap;
    }

    private ArrayList<Asztal> feltoltesAsztal() throws IOException {
        File file = (File) Files.readAllLines(Path.of("asztal.txt"));
        Scanner asztalfile = new Scanner(file);

        String data = "";
        while (asztalfile.hasNextLine()) {

            data += asztalfile.nextLine();

//            Asztal asztalt = new Asztal(szin,);
//            asztalok.add(asztalt);
        }
        String[] et = data.split("\\n");

        asztalfile.close();
        return asztalok;
    }
    private Etel Kivalaszt (String etelNeve){
        int i =0;
        while (!(etlap.get(i).getNeve().equals(etelNeve))) {
            i++;
            
        }
        
        return etlap.get(i);
    }
    
}
