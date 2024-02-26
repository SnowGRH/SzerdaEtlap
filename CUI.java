/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rendeles;

import java.io.IOException;
import java.util.List;
import model.Etel;
import model.Etterem;

/**
 *
 * @author vinczeffy.gergely
 */
public class CUI {
    public static void main(String[] args) throws IOException {
        Etterem etterem = new Etterem();
        List<Etel> e = etterem.getEtlap();
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));
        }
    }
}
