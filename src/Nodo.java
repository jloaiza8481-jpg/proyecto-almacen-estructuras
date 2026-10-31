public class Nodo {
    String dato; // Placa del camión o código del contenedor
    Nodo siguiente;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}