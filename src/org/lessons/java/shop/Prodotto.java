package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    // Attributi classe
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // Costruttore che popola solo il codice
    public Prodotto() {
        Random rand = new Random();
        this.codice = rand.nextInt();
    }

    // Costruttore che popola gli attributi
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        // Assegno valore random a codice
        Random rand = new Random();
        this.codice = rand.nextInt(); // Genero numero int random e lo assegno ad attributo codice
        // Passo parametri costruttore ad attributi classe
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Metodi getter
    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    // Metodi setter
    public void setNome(String nome) {
        if (nome != null)
            this.nome = nome;
    }

    public void setMarca(String marca) {
        if (marca != null)
            this.marca = marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        if (prezzo != null)
            this.prezzo = prezzo;
    }

    public void setIva(BigDecimal iva) {
        if (iva != null)
            this.iva = iva;
    }

    // Altri metodi

    public void PrezzoIva() {
        BigDecimal prezzoConIva = this.prezzo.add(this.prezzo.multiply(this.iva));
        System.out.println("Prezzo con iva: " + prezzoConIva);
    }

    public void NomeEsteso() {
        System.out.println("Nome esteso: " + this.codice + "-" + this.nome);
    }

}
