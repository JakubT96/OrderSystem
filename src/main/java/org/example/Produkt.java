package org.example;

import java.util.Scanner;

public class Produkt {

    private String nazev;

    private String popis;

    private double cena;

    public Produkt(String nazev, String popis, double cena) {
        this.nazev = nazev;
        this.popis = popis;
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public String getPopis() {
        return popis;
    }

    public double getCena() {
        return cena;
    }
}
