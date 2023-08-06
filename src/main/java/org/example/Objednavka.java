package org.example;
import java.util.ArrayList;

public class Objednavka implements OrderInterface {

    private int number;

    private Produkt produkt;

    private Zakaznik zakaznik;

    private Adresa fakturacniAdresa;

    private Adresa dodaciAdresa;


    public Objednavka(int number, Produkt produkt, Zakaznik zakaznik, Adresa fakturacniAdresa, Adresa dodaciAdresa) {
        this.number = number;
        this.produkt = produkt;
        this.zakaznik = zakaznik;
        this.fakturacniAdresa = fakturacniAdresa;
        this.dodaciAdresa = dodaciAdresa;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String getFirstName() {
        return zakaznik.getJmeno();
    }

    @Override
    public String getLastName() {
        return zakaznik.getPrijmeni();
    }

    @Override
    public String getStreet() {
        return fakturacniAdresa.getUlice();
    }

    @Override
    public int getHouseNumber() {
        return fakturacniAdresa.getCisloPopisne();
    }

    @Override
    public int getRegistryNumber() {
        return fakturacniAdresa.getCisloOrientacni();
    }

    @Override
    public String getCity() {
        return fakturacniAdresa.getMesto();
    }

    @Override
    public String getZipCode() {
        return fakturacniAdresa.getPsc();
    }

    @Override
    public String getCountry() {
        return "Česká republika";
    }

    @Override
    public ArrayList<String> getProducts() {
        ArrayList<String> produkty = new ArrayList<>();
        produkty.add(produkt.getNazev());

        return produkty;
    }

    @Override
    public ArrayList<Integer> getProductQuantities() {
        ArrayList<Integer> produkty = new ArrayList<>();
        produkty.add(1);

        return produkty;
    }

    @Override
    public ArrayList<Double> getProductPrices() {
        ArrayList<Double> produkty = new ArrayList<>();
        produkty.add(produkt.getCena());

        return produkty;
    }
}
