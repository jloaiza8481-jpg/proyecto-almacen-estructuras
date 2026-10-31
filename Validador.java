import java.util.Scanner;

public class Validador {

    private static final Scanner scanner = new Scanner(System.in);

    // Lee un numero entero y vuelve a preguntar si el dato no es valido.
    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero entero.");
            }
        }
    }

    // Lee un entero y comprueba que este dentro del rango permitido.
    public static int leerEntero(String mensaje, int minimo, int maximo) {
        while (true) {
            int numero = leerEntero(mensaje);

            if (numero >= minimo && numero <= maximo) {
                return numero;
            }

            System.out.println("Error: ingrese un numero entre "
                    + minimo + " y " + maximo + ".");
        }
    }

    // Lee un texto y evita que el usuario deje el campo vacio.
    public static String leerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println("Error: este campo no puede quedar vacio.");
        }
    }
}
