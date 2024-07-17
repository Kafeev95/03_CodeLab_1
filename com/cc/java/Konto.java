package com.cc.java;
public class Konto {
    private int kontostand;

    // Konstruktor
    public Konto(int initialStand) {
        this.kontostand = initialStand;
    }

    // Getter für kontostand
    public int getKontostand() {
        return kontostand;
    }

    // Setter für kontostand
    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

}
