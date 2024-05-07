package com.alura.modelos;

public class Menu
{
    public void muestraEncabezado()
    {
        // emoticones: ⚠️🔥📝✅❎📂⚙️🏷️📦📆🗓️🕑🏁➡️⬆️🎁🛒🛍️✏️🖍️✂️🔒🔓💎😀😃
        //**
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║ ALURA LATAM                                            ║");
        System.out.println("║ CHALENGER CONVERSOR DE MONEDAS                         ║");
        System.out.println("║ Profesores: Bruno Fernández / Genesys Rondon           ║");
        System.out.println("║ Backend con JAVA 17                                    ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ Usando API de: https://v6.exchangerate-api.com/v6/     ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }

    public void muestreDespedida()
    {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║                         DESPEDIDA                      ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ Muchas gracias por usar este conversor de monedas      ║");
        System.out.println("║ Nos vemos pronto!!                                     ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");;
    }

    public void muestreMenu()
    {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║                         MENÚ                           ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Convertir un monto de una moneda a otra             ║");
        System.out.println("║ 2. Ver monedas y paises disponibles                    ║");
        System.out.println("║ 3. Salir                                               ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.print("Ingrese su opción: ");
    }

    public void convertirMoneda()
    {

    }
    public void muestraMonedas()
    {

    }
}
