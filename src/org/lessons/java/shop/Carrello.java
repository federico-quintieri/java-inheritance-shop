package org.lessons.java.shop;

import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        // Istanza scanner per far inserire input
        Scanner input = new Scanner(System.in);

        // Istanza array lista
        List<Prodotto> carrello = new ArrayList<>();

        while (true) {
            // Messaggio su terminale
            System.out.println("Che prodotto vuoi aggiungere?(smartphone, televisore, cuffie, fine per terminare)");

            // Inserisco input
            String tipoOggetto = input.nextLine().toLowerCase();

            // Ciclo che termina quando utente inserisce fine
            if (tipoOggetto.equals("fine")) {
                break;
            }

            // Chiedo e salvo tutti gli attributi che ogni prodotto ha
            System.out.println("Inserisci il nome del prodotto:");
            String nome = input.nextLine();

            System.out.println("Inserisci la marca del prodotto:");
            String marca = input.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            BigDecimal prezzo = input.nextBigDecimal();

            System.out.println("Inserisci l'IVA del prodotto:");
            BigDecimal iva = input.nextBigDecimal();
            input.nextLine(); // Consuma il newline rimasto

            // In base al tipoOggetto entro in uno switch
            switch (tipoOggetto) {
                // Se è smartphone chiedo gli attributi della classe smartphone e infine
                // aggiungo alla lista di tipo Prodotto un nuovo oggetto Smartphone con tutti i
                // dati presi fino ad ora
                case "smartphone":
                    System.out.println("Inserisci l'IMEI dello smartphone:");
                    String imei = input.nextLine();

                    System.out.println("Inserisci la memoria dello smartphone (GB):");
                    int memoria = input.nextInt();
                    input.nextLine();

                    carrello.add(new Smartphone(nome, marca, prezzo, iva, imei, memoria));
                    break;
                // Questa operazione è la stessa per tutti gli altri due oggetti
                case "televisore":
                    System.out.println("Inserisci la dimensione dello schermo (pollici):");
                    int dimensione = input.nextInt();

                    System.out.println("Ha una Smart TV? (true/false):");
                    boolean smartTv = input.nextBoolean();
                    input.nextLine();

                    carrello.add(new Televisore(nome, marca, prezzo, iva, dimensione, smartTv));
                    break;

                case "cuffie":
                    System.out.println("Sono wireless? (true/false):");
                    boolean tipoConnessione = input.nextBoolean();

                    System.out.println("Di che colore sono?:");
                    String colore = input.nextLine();
                    input.nextLine();

                    carrello.add(new Cuffia(nome, marca, prezzo, iva, colore, tipoConnessione));
                    break;
                // Se il prodotto non è valido mando un alert tipo
                default:
                    System.out.println("Tipo di prodotto non valido.");
                    break;
            }
        }
        // Chiudo istanza input Scanner
        input.close();

        // Stampa il carrello, le Liste sono tipo array
        System.out.println("\nContenuto del carrello:"); // Vado a capo nel terminales
        // Per ogni istanza prodotto nella lista carrello lo printo
        for (Prodotto prodotto : carrello) {
            System.out.println(prodotto.toString());
        }
    }
}
