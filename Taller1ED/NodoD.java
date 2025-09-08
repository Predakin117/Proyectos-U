package taller1;
public class NodoD {
    int dato;
    NodoD sig;
    NodoD ant;

    public NodoD(int entrada) {
        this.dato = entrada;
        this.sig = null;
        this.ant = null;
    }
}