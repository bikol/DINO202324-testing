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
        
        if(a == "Pajton")
            return "Nie dotykaj Pajtona, bo cie ugryzie.";
        else if(a=="" && b=="")
            return"Dodawanie – wspólna nazwa różnych działań matematycznych, zdefiniowanych na różnych zbiorach i klasach, m.in. tych liczbowych, ale też dla wektorów, niektórych funkcji i części innych zbiorów. ";
            
        return ""+(Integer.parseInt(b) + Integer.parseInt(a));
    }
}
