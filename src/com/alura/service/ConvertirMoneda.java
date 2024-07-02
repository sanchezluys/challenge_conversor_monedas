package com.alura.service;

import com.alura.modelos.Monedas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertirMoneda {

    public void convertirMoneda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la solicitud de conversión (ej. 50 pesos a bolivianos): ");
        String solicitud = scanner.nextLine().toLowerCase();

        Pattern patron = Pattern.compile("^([0-9]+\\.*[0-9]*)\\s+([A-Za-z\\s]+)\\s+a\\s+([A-Za-z\\s]+)$");
        Matcher matcher = patron.matcher(solicitud);

        if (matcher.matches()) {
            float monto = Float.parseFloat(matcher.group(1));
            String aliasMonedaBase = matcher.group(2);
            String aliasMonedaTarget = matcher.group(3);

            Monedas monedaBase = Monedas.fromAlias(aliasMonedaBase);
            Monedas monedaTarget = Monedas.fromAlias(aliasMonedaTarget);

            if (monedaBase != null && monedaTarget != null) {
                // Aquí deberías implementar la lógica de conversión usando una API o datos predefinidos
                float tasaConversion = obtenerTasaDeConversion(monedaBase, monedaTarget);
                float montoConvertido = monto * tasaConversion;

                System.out.println("Monto: " + monto);
                System.out.println("Moneda base: " + monedaBase.getNombre());
                System.out.println("Moneda objetivo: " + monedaTarget.getNombre());
                System.out.println("Monto convertido: " + montoConvertido);
            } else {
                System.out.println("Moneda no reconocida.");
            }
        } else {
            System.out.println("Formato de solicitud incorrecto.");
        }
    }

    private float obtenerTasaDeConversion(Monedas monedaBase, Monedas monedaTarget) {
        // Aquí deberías implementar la llamada a una API para obtener la tasa de conversión
        // Por ahora, puedes retornar una tasa de conversión fija para pruebas
        return 1.0f; // Ejemplo: tasa de conversión ficticia
    }


}
