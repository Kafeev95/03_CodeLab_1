package com.cc.java;

public class App {
    
    public static void main(String[] args) {
         // Erstellen von drei Instanzen der Klasse Konto
         Konto konto1 = new Konto(10000);
         Konto konto2 = new Konto(10000);
         Konto konto3 = new Konto(10000);
 
         // Ausgabe des anfänglichen Kontostands aller drei Konto-Objekte
         output("Anfänglicher Kontostand von konto1: " + konto1.getKontostand());
         output("Anfänglicher Kontostand von konto2: " + konto2.getKontostand());
         output("Anfänglicher Kontostand von konto3: " + konto3.getKontostand());
 
         // Ändern des Kontostands der Konto-Objekte
         konto1.setKontostand(konto1.getKontostand() * 2);
         konto2.setKontostand(konto2.getKontostand() * 3);
         konto3.setKontostand(konto3.getKontostand() * 10);
 
         // Ausgabe des geänderten Kontostands aller drei Konto-Objekte
         output("Geänderter Kontostand von konto1: " + konto1.getKontostand());
         output("Geänderter Kontostand von konto2: " + konto2.getKontostand());
         output("Geänderter Kontostand von konto3: " + konto3.getKontostand()); 
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}