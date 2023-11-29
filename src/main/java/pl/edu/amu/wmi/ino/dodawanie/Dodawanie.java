/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.ino.dodawanie;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    public static String dodaj(String a, String b){
        String result = "";
        if(a != null && b != null){
            if(a == "NaN" || b == "NaN"){
                result = "NaN";
            }
            else if(a.matches("[0-9]+") && b.matches("[0-9]+")){
                result = ""+(Integer.parseInt(b) + Integer.parseInt(a));
            }
            else if(a.matches("[0-9]+.[0-9]+") && b.matches("[0-9]+.[0-9]+")){
                result = ""+(Float.parseFloat(b) + Float.parseFloat(a));
            }
        }
        return result;
    }
}
