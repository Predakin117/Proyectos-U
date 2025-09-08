package taller1;

public class Agenda {
    String nombre;
    String telefono;
    String correo;
    Agenda ant;
    Agenda sig;

    // Constructor
    public Agenda(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.ant = null;
        this.sig = null;
    }
}
