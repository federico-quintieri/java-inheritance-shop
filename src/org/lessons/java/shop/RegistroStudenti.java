package org.lessons.java.shop;

public class RegistroStudenti {
    private Studente[] registro;
    private int numeroStudenti; // Tiene traccia del numero di studenti inseriti

    // Costruttore con dimensione fissa
    public RegistroStudenti(int maxStudenti) {
        this.registro = new Studente[maxStudenti]; // Impostiamo array attributo di una certa grandezza
        this.numeroStudenti = 0;
    }

    // Metodo per aggiungere uno studente
    public void aggiungiStudente(Studente studente) {
        if (numeroStudenti < registro.length) {
            registro[numeroStudenti] = studente;
            numeroStudenti++;
        } else {
            System.out.println("Registro pieno! Impossibile aggiungere altri studenti.");
        }
    }

    // Metodo per mostrare tutti gli studenti
    public void mostraStudenti() {
        for (int i = 0; i < numeroStudenti; i++) {
            System.out.println(registro[i].InfoStudente());
        }
    }
}
