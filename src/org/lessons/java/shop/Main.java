package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Smartphone Nokia = new Smartphone("Nokia A-70", "Nokia", BigDecimal.valueOf(210), BigDecimal.valueOf(0.2),
                "323/23123/1231",
                128);

        Nokia.NomeEsteso();
        System.out.println(Nokia.getImei());
        System.out.println(Nokia.getMemoria());

        Televisore miaTv = new Televisore("Mia tv", "Samsung", BigDecimal.valueOf(400.21), BigDecimal.valueOf(0.22), 45,
                true);

        miaTv.NomeEsteso();
        System.out.println(miaTv.getPollici());

        Cuffia mieCuffie = new Cuffia("Cuffie Fede", "Sony", BigDecimal.valueOf(312), BigDecimal.valueOf(0.10), "Blue",
                true);

        System.out.println(mieCuffie.getWireless());
        mieCuffie.setWireless(false);
        System.out.println(mieCuffie.getWireless());
        mieCuffie.setMarca("Hoyo");
        System.out.println(mieCuffie.getMarca());
    }
}
