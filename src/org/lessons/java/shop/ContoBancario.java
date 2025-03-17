package org.lessons.java.shop;

import java.math.BigDecimal;

public class ContoBancario {

    // Attributi
    private int numeroConto;
    private BigDecimal saldo;

    // Costruttore che inizializzo un conto con un certo numero a zero
    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = BigDecimal.valueOf(0);
    }

    // Metodi pubblici
    public void Deposita(BigDecimal deposito) {
        this.saldo = this.saldo.add(deposito); // Aggiungo al saldo
    };

    public void Preleva(BigDecimal prelievo) {
        this.saldo = this.saldo.subtract(prelievo);
    }

    // Metodi get
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public int getNumeroConto() {
        return this.numeroConto;
    }
}
