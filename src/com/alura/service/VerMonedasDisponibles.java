package com.alura.service;

import com.alura.modelos.Monedas;

public class VerMonedasDisponibles {

    public void muestraMonedas() {
        System.out.println("Monedas disponibles:");
        for (Monedas moneda : Monedas.values()) {
            System.out.println(moneda.getNombre() + " (" + String.join(", ", moneda.getAlias()) + ")");
        }
    }

}
