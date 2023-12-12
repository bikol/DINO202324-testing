/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.ino.dodawanie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

    @Test
    public void testDodaj() {
        System.out.println("dodaj");
        String a = "1";
        String b = "1";
        String expResult = "2";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodaj2() {
        System.out.println("dodaj2");
        String a = "0";
        String b = "0";
        String expResult = "0";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodaj3() {
        System.out.println("randomAdd");
        
        for(int i = 0 ; i<100;i++){
            for(int j=0 ;j<100;j++){
                String a = ""+i;
                String b = ""+j;
                String expResult = ""+(i+j);
                String result = Dodawanie.dodaj(a, b);
                assertEquals(expResult, result);
            }
        }

    }
    
    
    @Test
    public void testDodajNull() {
        System.out.println("dodajDefenicja");
        String a = null;
        String b = null;
        String expResult = "";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodajempty() {
        System.out.println("dodaj2");
        String a = "";
        String b = "";
        String expResult = "";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodajAla() {
        System.out.println("dodajAla");
        String a = "Ala";
        String b = "ma kota";
        String expResult = "10";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodajBob() {
        System.out.println("dodajBob");
        String a = "Bob";
        String b = "ma psa";
        String expResult = "9";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
}
