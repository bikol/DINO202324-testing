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
        
        if(a == null && b==null)
            return "";
        else if(a=="" && b=="")
            return "";
        else if(b=="+")
            return ""+ (Integer.parseInt(a) + 1);
        else if(b == "")
            return a;
        return ""+(Integer.parseInt(b) + Integer.parseInt(a));
    }
}
