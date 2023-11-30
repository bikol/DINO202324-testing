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
        else if((value(a) & value(b)) != -1)
            return ""+(value(a)+value(b));
        else if (((a.length() > 3 & a.matches("[01]+"))) & (b.length() > 3 & b.matches("[01]+")))
            return ""+(Integer.parseInt(b, 2) + Integer.parseInt(a, 2));
        return ""+(Integer.parseInt(b) + Integer.parseInt(a));
    }
    public static int value(String r)
    {
        if (r == "I")
            return 1;
        if (r == "V")
            return 5;
        if (r == "X")
            return 10;
        if (r == "L")
            return 50;
        if (r == "C")
            return 100;
        if (r == "D")
            return 500;
        if (r == "M")
            return 1000;
        return -1;
    }
}
