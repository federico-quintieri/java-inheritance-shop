package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffia extends Prodotto {

    private String colore;
    private boolean wireless;

    // Costruttore che inizializza istanza
    public Cuffia(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {

        super(nome, marca, prezzo, iva); // Chiamo costruttore della classe genitore passandogli parametri del
                                         // costruttore attuale
        this.colore = colore;
        this.wireless = wireless;
    }

    // Metodi getter
    public String getColore() {
        return this.colore;
    }

    public boolean getWireless() {
        return this.wireless;
    }

    // Metodi setter
    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
