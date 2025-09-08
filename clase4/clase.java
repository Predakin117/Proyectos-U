package clase4;

import java.util.ArrayList;

public class clase {
    public static void main(String[] args) {
        
        ArrayList<String> compras = new ArrayList<>();
        
        compras.add("Pan");
        compras.add("Leche");
        compras.add("Arroz");

        //agregar huevos

        compras.add("Huevos");

        //modificar leche

        compras.set(1,"Jugo");

        //eliminar pan

        compras.remove("Pan");

        System.out.println("Lista de compras: " + compras);

    }
}