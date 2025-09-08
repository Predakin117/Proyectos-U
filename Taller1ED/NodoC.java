package taller1;

public class NodoC {
    int dato;
    NodoC sig;
    String nombre;

    public NodoC(int dato, String nombre) {
        this.nombre = nombre;
        this.dato = dato;
        this.sig = null;
    }
}
