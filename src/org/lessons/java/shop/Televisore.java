package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {

    private int pollici;
    private boolean smart;

    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int pollici, boolean smart) {

        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }

    // Metodi setter
    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    // Metodi getter
    public int getPollici() {
        return this.pollici;
    }

    public boolean getSmart() {
        return this.smart;
    }
     // Override di metodi
     @Override
     public String toString() {
         return "Televisore{" +
                 "nome='" + getNome() + '\'' +
                 ", marca='" + getMarca() + '\'' +
                 ", prezzo=" + getPrezzo() +
                 ", iva=" + getIva() +
                 ", pollici='" + pollici + '\'' +
                 ", smart=" + smart +
                 '}';
     }
}
