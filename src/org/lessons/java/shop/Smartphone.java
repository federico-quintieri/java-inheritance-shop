package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private String imei;
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String imei, int memoria) {
        super(nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    // Metodi getter
    public String getImei() {
        return this.imei;
    }

    public int getMemoria() {
        return this.memoria;
    }

    // Metodi setter
    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
