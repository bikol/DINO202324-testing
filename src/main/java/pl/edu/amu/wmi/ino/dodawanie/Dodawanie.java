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

        switch(a+b) {
            case "truetrue":
                return "true";
            case "falsetrue":
            case "truefalse":
            case "falsefalse":
                return "false";
            default:
                break;
        }

        if(a == null && b==null)
            return "";
        else if(a=="" && b=="")
            return "";

        if (a.matches("^[-+]?[0-9]+\\.[0-9]+f?$") && b.matches("^[-+]?[0-9]+\\.[0-9]+f?$")) {
            return ""+(Float.parseFloat(b) + Float.parseFloat(a))+"f";
        }

        return ""+(Integer.parseInt(b) + Integer.parseInt(a));
    }
}
