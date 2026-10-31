public class SistemaLogistica {

    private Cola colaCamiones;
    private Pila pilaContenedores;

    public SistemaLogistica() {
        colaCamiones = new Cola();
        pilaContenedores = new Pila();
    }

    // Inicia el menu principal del sistema.
    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = Validador.leerEntero("Seleccione una opcion: ", 1, 5);

            switch (opcion) {
                case 1:
                    registrarCamion();
                    break;
                case 2:
                    descargarCamion();
                    break;
                case 3:
                    retirarContenedor();
                    break;
                case 4:
                    consultarEstado();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema de logistica.");
                    break;
                default:
                    // La validacion del menu evita llegar a este caso.
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);
    }

    // Imprime las opciones disponibles.
    private void mostrarMenu() {
        System.out.println("\n========================================");
        System.out.println("       SISTEMA DE LOGISTICA DEL ALMACEN");
        System.out.println("========================================");
        System.out.println("1. Registrar llegada de camion");
        System.out.println("2. Descargar camion del muelle");
        System.out.println("3. Retirar contenedor del estante");
        System.out.println("4. Consultar estado actual del almacen");
        System.out.println("5. Salir");
        System.out.println("----------------------------------------");
    }

    // Agrega la placa del camion al final de la cola.
    private void registrarCamion() {
        System.out.println("\n--- REGISTRAR LLEGADA DE CAMION ---");
        String placa = Validador.leerTexto("Ingrese la placa del camion: ");

        colaCamiones.encolar(placa);

        System.out.println("Camion " + placa + " registrado correctamente.");
    }

    // Atiende el primer camion de la cola y apila los contenedores que trae.
    private void descargarCamion() {
        System.out.println("\n--- DESCARGAR CAMION DEL MUELLE ---");

        if (colaCamiones.estaVacia()) {
            System.out.println("No hay camiones esperando para descargar.");
            return;
        }

        // Se retira de la cola el camion que llego primero.
        String placa = colaCamiones.desencolar();
        System.out.println("Se esta descargando el camion: " + placa);

        int cantidad = Validador.leerEntero(
                "Cuantos contenedores trae el camion? ", 1, 100);

        for (int i = 1; i <= cantidad; i++) {
            String codigo = Validador.leerTexto(
                    "Ingrese el codigo del contenedor " + i + ": ");

            // Se conserva el dato como String y se identifica su camion de origen.
            String contenedor = codigo + " (Camion " + placa + ")";
            pilaContenedores.apilar(contenedor);
        }

        System.out.println("Camion " + placa + " descargado correctamente.");
        System.out.println("Se almacenaron " + cantidad + " contenedores en la pila.");
    }

    // Retira unicamente el contenedor que se encuentra en la cima de la pila.
    private void retirarContenedor() {
        System.out.println("\n--- RETIRAR CONTENEDOR DEL ESTANTE ---");

        if (pilaContenedores.estaVacia()) {
            System.out.println("No hay contenedores para retirar.");
            return;
        }

        String contenedor = pilaContenedores.desapilar();
        System.out.println("Contenedor retirado: " + contenedor);
    }

    // Delega la consulta al visualizador.
    private void consultarEstado() {
        VisualizadorAlmacen.mostrarEstado(colaCamiones, pilaContenedores);
    }
}
