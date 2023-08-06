package org.example;

import java.util.Scanner;


public class Zakaznik {

    private int id;

    private String jmeno;

    private String prijmeni;

    public Zakaznik(int id, String jmeno, String prijmeni) {
        this.id = id;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni;
    }

    public int getId() {
        return id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
}
