public class Pila {
    private Nodo cima;
    private int tamanio;

    public Pila() {
        this.cima = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamanio++;
    }

    public String desapilar() {
        if (estaVacia()) {
            return null;
        }
        String datoRetirado = cima.dato;
        cima = cima.siguiente;
        tamanio--;
        return datoRetirado;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("El estante está vacío.");
            return;
        }
        Nodo actual = cima;
        System.out.println("--- CONTENEDORES EN ESTANTE (Pila) ---");
        while (actual != null) {
            System.out.println("[ " + actual.dato + " ]");
            actual = actual.siguiente;
        }
    }
}