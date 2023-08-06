package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zakaznik zakaznik = new Zakaznik(1, "Jakub", "Toman");
        Adresa adresa = new Adresa("Pod horkou", 234, 1, "Prštice", "66446");
        Produkt produkt = new Produkt("MacBook pro Java", "Notebook pro programování v java.", 23000);
        Objednavka objednavka = new Objednavka(1, produkt, zakaznik, adresa, adresa);
        Gateway brana = new Gateway();
        brana.processOrder(objednavka);
    }
}