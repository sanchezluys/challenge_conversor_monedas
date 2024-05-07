import com.alura.modelos.Menu;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.muestraEncabezado();
        //
        String opcion="0";
        Scanner scanner = new Scanner(System.in);
        //
        while(!opcion.equals("3"))
        {
            menu.muestreMenu();
            //
            opcion = scanner.nextLine();
            //
            switch (opcion)
            {
                case "1":
                    System.out.println("Has seleccionado convertir un monto.");
                    menu.convertirMoneda();
                    break;
                case "2":
                    System.out.println("Has seleccionado ver las monedas y países disponibles.");
                    menu.muestraMonedas();
                    break;
                case "3":
                    menu.muestreDespedida();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

        }

        scanner.close();


        String solicitud="50 a "; //teclado.nextLine().toLowerCase();


        // Definir el patrón de la solicitud
        Pattern patron = Pattern.compile("^([0-9]+\\.*[0-9]*)\\s+([A-Za-z\\s]+)\\s+a\\s+([A-Za-z\\s]+)$");

        // Crear un objeto Matcher para buscar el patrón en la solicitud
        Matcher matcher = patron.matcher(solicitud);

        // Verificar si la solicitud coincide con el patrón
        if (matcher.matches()) {
            // Obtener los componentes de la solicitud
            float monto = Float.parseFloat(matcher.group(1));
            String monedaBase = matcher.group(2);
            String monedaTarget = matcher.group(3);

            // Imprimir los componentes de la solicitud
            System.out.println("Monto: " + monto);
            System.out.println("Moneda base: " + monedaBase);
            System.out.println("Moneda objetivo: " + monedaTarget);
        } else {
            System.out.println("Formato de solicitud incorrecto.");
        }
        //teclado.close();

    }
}