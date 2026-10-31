public class VisualizadorAlmacen {

    // Consulta los camiones que todavia esperan en el muelle.
    public static void mostrarColaCamiones(Cola cola) {
        System.out.println("\n=== CAMIONES ESPERANDO EN EL MUELLE ===");

        if (cola == null) {
            System.out.println("La cola no esta inicializada.");
            return;
        }

        // La propia clase Cola se encarga de recorrer sus nodos.
        cola.mostrarCola();
    }

    // Consulta los contenedores almacenados en el estante.
    public static void mostrarPilaContenedores(Pila pila) {
        System.out.println("\n=== CONTENEDORES EN EL ESTANTE ===");

        if (pila == null) {
            System.out.println("La pila no esta inicializada.");
            return;
        }

        // La propia clase Pila se encarga de recorrer sus nodos.
        pila.mostrarPila();
    }

    // Muestra las dos estructuras sin retirar ni agregar elementos.
    public static void mostrarEstado(Cola cola, Pila pila) {
        System.out.println("\n========================================");
        System.out.println("          ESTADO ACTUAL DEL ALMACEN");
        System.out.println("========================================");

        mostrarColaCamiones(cola);
        mostrarPilaContenedores(pila);

        System.out.println("\n========================================\n");
    }
}
