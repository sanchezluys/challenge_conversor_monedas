package com.alura.modelos;

public enum Monedas {
    USD("Dólar Estadounidense", "dólar", "usd","dolar","dolares","Dolares"),
    VES("Bolivar Venezolano", "bs", "Bs"),
    COP("Pesos Colombianos", "pesos", "Pesos"),
    BRL("Real Brasilero", "real", "Real"),
    EUR("Euro", "euro", "eur"),
    PEN("Sol Peruano", "sol", "pen","Sol","Soles","soles"),
    PAB("Balboa Panameño", "balboa", "Balboa","pab"),
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

