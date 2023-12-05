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
        if(a == null || b == null)
            return null;
        if(!isNumeric(a))
            a = "0";
        if(!isNumeric(b))
            b = "0";
        return ""+(Integer.parseInt(b) + Integer.parseInt(a));
    }
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }
}
