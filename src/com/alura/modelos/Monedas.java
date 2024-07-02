package com.alura.modelos;

public enum Monedas {
    USD("Dólar estadounidense", "dólar", "usd","dolar"),
    EUR("Euro", "euro", "eur"),
    PEN("Sol peruano", "sol", "pen"),
    BOB("Boliviano", "boliviano", "bob");

    private final String nombre;
    private final String[] alias;

    Monedas(String nombre, String... alias) {
        this.nombre = nombre;
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getAlias() {
        return alias;
    }

    public static Monedas fromAlias(String alias) {
        for (Monedas moneda : values()) {
            for (String a : moneda.alias) {
                if (a.equalsIgnoreCase(alias)) {
                    return moneda;
                }
            }
        }
        return null;
    }
}

