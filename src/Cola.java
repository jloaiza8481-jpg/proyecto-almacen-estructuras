public class Cola {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void encolar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        tamanio++;
    }

    public String desencolar() {
        if (estaVacia()) {
            return null;
        }
        String datoAtendido = primero.dato;
        primero = primero.siguiente;
        if (primero == null) {
            ultimo = null;
        }
        tamanio--;
        return datoAtendido;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("El muelle no tiene camiones en espera.");
            return;
        }
        Nodo actual = primero;
        System.out.println("--- CAMIONES EN COLA (Muelle) ---");
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". Camión: " + actual.dato);
            actual = actual.siguiente;
            i++;
        }
    }
}