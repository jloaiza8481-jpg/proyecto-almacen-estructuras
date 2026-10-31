import java.util.Scanner;

public class Validador {
    private static Scanner scanner = new Scanner(System.in);

    // Método seguro para leer números enteros (evita que el programa falle por letras)
    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                entradaValida = true;
            } else {
                System.out.println("❌ Error: Debe ingresar un número entero válido. Intente de nuevo.");
                scanner.next(); // Limpia el búfer del scanner
            }
        }
        scanner.nextLine(); // Limpia el salto de línea pendiente
        return numero;
    }

    // Método para leer texto de forma limpia
    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}