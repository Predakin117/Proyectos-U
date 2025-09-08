package clase4;

import java.util.ArrayList;
import java.util.Collections;

public class clase2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(7);
        numeros.add(15);
        numeros.add(3);
        numeros.add(20);
        numeros.add(10);

        int mayor = Collections.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        Collections.sort(numeros);
        System.out.println("Orden: " + numeros);



    }
}