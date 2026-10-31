public class VisualizadorAlmacen {

    // Muestra la cola de camiones en espera en el muelle
    public static void mostrarColaCamiones(Object frenteCola) {
        System.out.println("\n=== 🚚 CAMIONES ESPERANDO EN LA COLA (MUELLE) ===");
        if (frenteCola == null) {
            System.out.println("[ El muelle está vacío, no hay camiones en espera ]");
        }
    }

    // Muestra la pila de contenedores en los estantes
    public static void mostrarPilaContenedores(Object cimaPila) {
        System.out.println("\n=== 📦 ESTANTE DE CONTENEDORES (PILA - CIMA ARRIBA) ===");
        if (cimaPila == null) {
            System.out.println("[ El estante está totalmente vacío ]");
        }
    }
}