package org.example;
import java.util.Scanner;


public class Adresa {

    private String ulice;

    private int cisloPopisne;

    private int cisloOrientacni;


    private String mesto;

    private String psc;

    public Adresa(String ulice, int cisloPopisne, int cisloOrientacni, String mesto, String psc) {
        this.ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.cisloOrientacni = cisloOrientacni;
        this.mesto = mesto;
        this.psc = psc;
    }

    @Override
    public String toString() {
        return ulice + " " + cisloPopisne + "/" + cisloOrientacni + "," + mesto;
    }


    public String getUlice() {
        return ulice;
    }


    public int getCisloPopisne() {
        return cisloPopisne;
    }

    public int getCisloOrientacni() {
        return cisloOrientacni;
    }

    public String getMesto() {
        return mesto;
    }

    public String getPsc() {
        return psc;
    }
}
