package com.engeto.lupac;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EvidenceProdejcu {
    public static void main(String[] args) {
        String jmenoProdejce = "Josef";
        String prijmeniProdejce = "Novák";
        LocalDate datumNarozeniProdejce = LocalDate.of(1974,1,1);
        int pocetSmluvProdejce = 50;
        double hmotnostProdaneMrkve = 3.258 ; //v tunách
        String sidloProdejce = "Tábor";
        String spzProdejce = "ABC 0101";
        double spotrebaVozidlaProdejce = 7.5; // L/100Km
        String ipAdress = "1234.1234.1234.1234";

        System.out.println("Prodejce: " + jmenoProdejce + " " + prijmeniProdejce);
        System.out.println("Narozený dne: " + datumNarozeniProdejce.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu v tunách: " + hmotnostProdaneMrkve / pocetSmluvProdejce +"T" + " (=" + (hmotnostProdaneMrkve / pocetSmluvProdejce) * 1000 + "Kg)");


    }
}
