package org.example;
import java.util.ArrayList;

public interface OrderInterface {

    int getNumber();

    String getFirstName();

    String getLastName();

    String getStreet();

    int getHouseNumber();

    int getRegistryNumber();

    String getCity();

    String getZipCode();

    String getCountry();

    ArrayList<String> getProducts();

    ArrayList<Integer> getProductQuantities();

    ArrayList<Double> getProductPrices();
}