package com.alura.modelos;

import java.util.Scanner;


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
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║                  CONVERTIR MONEDA                      ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ 1. Ingrese la frase; por ejemplo:                         ║");
        System.out.println("║    10 pesos a dolares                                  ║");
        System.out.println("║    500 soles a pesos                                   ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.print("Ingrese la frase: ");
    }
    public void muestraMonedas()
    {
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║                  MONEDAS Y PAÍSES                      ║");
        System.out.println("╠════════════════════════════════════════════════════════╣");
        System.out.println("║ Lista de monedas disponibles:                          ║");
        System.out.println("║  - USD (Dólar estadounidense/ Dolar Ecuador)           ║");
        System.out.println("║  - COP (Peso Colombiano)                               ║");
        System.out.println("║  - VEF (Bolivar Venezolano)                            ║");
        System.out.println("║  - BRL (Real Brasilero)                                ║");
        System.out.println("║  - PEN (Sol Peruano)                                   ║");
        System.out.println("║  - PAB (Balboa Panameño)                               ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        System.out.print("Presione cualquier tecla para volver al menu principal");
    }

    public void inicio(){
        String opcion="0";
        Scanner scanner = new Scanner(System.in);
        //
        while(!opcion.equals("3"))
        {
            this.muestreMenu();
            //
            opcion = scanner.nextLine();
            //
            switch (opcion)
            {
                case "1":
                    System.out.println("Has seleccionado convertir un monto.");
                    convertirMoneda();
                    break;
                case "2":
                    System.out.println("Has seleccionado ver las monedas y países disponibles.");
                    muestraMonedas();
                    break;
                case "3":
                    muestreDespedida();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

        }

        scanner.close();
    }
}
