package com.alura.service;

import com.alura.modelos.Monedas;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertirMoneda {

    public void convertirMoneda() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Frase: ");
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

                //System.out.println("Monto: " + monto);
                System.out.println("Moneda base: " + monedaBase.getNombre());
                System.out.println("Moneda objetivo: " + monedaTarget.getNombre());
                System.out.println("Resultado: "
                        + monto + " "+ monedaBase.name()
                        + " son "+ montoConvertido
                        + " "+monedaTarget.name());
            } else {
                System.out.println("Moneda no reconocida.");
            }
        } else {
            System.out.println("Formato de solicitud incorrecto.");
        }
    }

    private float obtenerTasaDeConversion(Monedas monedaBase, Monedas monedaTarget) throws IOException {
        // Aquí deberías implementar la llamada a una API para obtener la tasa de conversión
        // Por ahora, puedes retornar una tasa de conversión fija para pruebas
        var conversion= this.consumirAPI(monedaBase.name(),monedaTarget.name());

        return conversion; //  tasa de conversión
    }

    private float consumirAPI(String moneda_Base, String moneda_target) throws IOException {
        // Setting URL
        // se va a usar la de pair
        String APIKEY = System.getenv("API_KEY");
        String MONEDA_BASE = moneda_Base;
        String MONEDA_TARGET = moneda_target;

        String url_str = "https://v6.exchangerate-api.com/v6/"+APIKEY+"/pair/"+MONEDA_BASE+"/"+MONEDA_TARGET;
        //System.out.println("api: "+url_str);
        // Making Request
                URL url = new URL(url_str);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.connect();
        // Convert to JSON
                JsonParser jp = new JsonParser();
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                JsonObject jsonobj = root.getAsJsonObject();
        // Accessing object
                String req_result = jsonobj.get("conversion_rate").getAsString();
                //System.out.println("resultado= "+req_result);
                return Float.parseFloat(req_result);
    }
}
