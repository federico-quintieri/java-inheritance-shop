package org.lessons.java.shop;

public class Studente {

    private String nome;
    private String cognome;
    private int età;

    // Costruttore
    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public String InfoStudente() {
        return nome + " " + cognome + ", " + età + " anni.";
    }
}
