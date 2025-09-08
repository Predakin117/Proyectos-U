package taller1;

import javax.swing.*;
import java.util.*;

public class Metodo {
    Nodo cab;
    NodoD cabD;
    NodoD ultD;
    NodoC cabC;
    String nombre;

    public Metodo() {
        cab = null;
        cabD = null;
        ultD = null;
        cabC = null;
        String nombre;
    }

    public boolean esVacia() {
        return cab == null;
    }

    public boolean esVaciaD() {
        return cabD == null;
    }

    public boolean esVaciaC() {
        return cabC == null;
    }

    public void notasMetodo() {
        int[] arreglo = new int[10];
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            String input = JOptionPane.showInputDialog("Ingresa el valor #" + (i + 1));
            arreglo[i] = Integer.parseInt(input);
            suma += arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }

    public void matrixX4() {
        int[][] matriz = new int[4][4];
        StringBuilder sb = new StringBuilder("Matriz identidad 4x4:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                sb.append(matriz[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void sumaMatrix(){
        int [][] matrix1 = new int [2][2];
        int [][] matrix2 = new int [2][2];
        int [][] suma = new int [2][2];

        JOptionPane.showMessageDialog(null, "Ingrese los valores de la primera matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("A[" + i + "][" + j + "]: ");
                matrix1[i][j] = Integer.parseInt(input);
            }
        }
        JOptionPane.showMessageDialog(null, "Ingrese los valores de la segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("B[" + i + "][" + j + "]: ");
                matrix2[i][j] = Integer.parseInt(input);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                suma[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        StringBuilder sb = new StringBuilder("Suma de las dos matrices 2x2:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(suma[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void matrizTranspuesta(){
        int[][] matriz = new int[3][2];
        int[][] transpuesta = new int[2][3];
        JOptionPane.showMessageDialog(null, "Ingrese los valores de la matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("A[" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(input);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
        StringBuilder sb = new StringBuilder("Matriz transpuesta 2x3:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(transpuesta[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());

    }

    public void generarNodosSimples(int cantidad) {
        cab = null;
        for (int i = 1; i <= cantidad; i++) {
            String valor = JOptionPane.showInputDialog("Ingrese el valor del nodo simple #" + i + ":");
            Nodo nuevo = new Nodo(Integer.parseInt(valor));
            if (cab == null) {
                cab = nuevo;
            } else {
                Nodo aux = cab;
                while (aux.sig != null) {
                    aux = aux.sig;
                }
                aux.sig = nuevo;
            }
        }
        JOptionPane.showMessageDialog(null, "Nodos simples generados correctamente.");
    }

    public void generarNodosDobles(int cantidad) {
        cabD = null;
        ultD = null;
        for (int i = 1; i <= cantidad; i++) {
            String valor = JOptionPane.showInputDialog("Ingrese el valor del nodo doble #" + i + ":");
            NodoD nuevo = new NodoD(Integer.parseInt(valor));
            if (cabD == null) {
                cabD = nuevo;
                ultD = nuevo;
            } else {
                ultD.sig = nuevo;
                nuevo.ant = ultD;
                ultD = nuevo;
            }
        }
        JOptionPane.showMessageDialog(null, "Nodos dobles generados correctamente.");
    }

    public void generarNodosCirculares(int cantidad) {
        cabC = null;
        NodoC ultimo = null;
        for (int i = 1; i <= cantidad; i++) {
            String valor = JOptionPane.showInputDialog("Ingrese el valor del nodo circular #" + i + ":");
            NodoC nuevo = new NodoC(i, valor);
            if (cabC == null) {
                cabC = nuevo;
                ultimo = nuevo;
                nuevo.sig = cabC;
            } else {
                ultimo.sig = nuevo;
                nuevo.sig = cabC;
                ultimo = nuevo;
            }
        }
        JOptionPane.showMessageDialog(null, "Nodos circulares generados correctamente.");
    }

    public void eliminarNodoSimple(int valor){
        if(cab == null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            return;
        }
        Nodo actual = cab;
        Nodo anterior = null;
        while(actual != null){
            if(actual.dato == valor){
                if(anterior == null){
                    cab = actual.sig;
                } else {
                    anterior.sig = actual.sig;
                }
                JOptionPane.showMessageDialog(null, "Nodo con valor " + valor + " eliminado.");
                return;
            }
            anterior = actual;
            actual = actual.sig;
        }
        JOptionPane.showMessageDialog(null, "Nodo con valor " + valor + " no encontrado.");
    }
    
    public void mostrarListaSimple() {
        if (cab == null) {
            JOptionPane.showMessageDialog(null, "La lista simple está vacía.");
            return;
        }
        StringBuilder sb = new StringBuilder("Lista Simple:\n");
        Nodo aux = cab;
        while (aux != null) {
            sb.append(aux.dato).append(" -> ");
            aux = aux.sig;
        }
        sb.append("null");
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void mostrarListaDoble() {
        if (cabD == null) {
            JOptionPane.showMessageDialog(null, "La lista doble está vacía.");
            return;
        }
        StringBuilder sb = new StringBuilder("Lista Doble:\n");
        NodoD aux = cabD;
        while (aux != null) {
            sb.append(aux.dato).append(" <-> ");
            aux = aux.sig;
        }
        sb.append("null");
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void mostrarListaCircular() {
        if (cabC == null) {
            JOptionPane.showMessageDialog(null, "La lista circular está vacía.");
            return;
        }
        StringBuilder sb = new StringBuilder("Lista Circular:\n");
        NodoC aux = cabC;
        do {
            sb.append(aux.dato).append(" -> ");
            aux = aux.sig;
        } while (aux != cabC);
        sb.append("(regresa al inicio)");
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void listaCircularNombres() {
        // Crear nodos NodoC (nombre, dato)
        NodoC n1 = new NodoC(1, "Ana");
        NodoC n2 = new NodoC(2, "Luis");
        NodoC n3 = new NodoC(3, "Sofia");
        NodoC n4 = new NodoC(4, "Carlos");

        n1.sig = n2;
        n2.sig = n3;
        n3.sig = n4;
        n4.sig = n1;

        NodoC actual = n1;
        StringBuilder sb = new StringBuilder("Recorriendo la lista circular dos veces:\n");
        int contador = 0;
        int total = 4 * 2;

        while (contador < total) {
            sb.append("Compañero: ").append(actual.nombre).append(" (").append(actual.dato).append(")\n");
            actual = actual.sig;
            contador++;
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void insertarDobleFinal(int valor) {
        NodoD nuevo = new NodoD(valor);
        if (cabD == null) {
            cabD = nuevo;
            ultD = nuevo;
        } else {
            ultD.sig = nuevo;
            nuevo.ant = ultD;
            ultD = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Nodo doble insertado al final: " + valor);
    }

    public void recorrerListaDoble() {
        if (cabD == null) {
            JOptionPane.showMessageDialog(null, "La lista doble está vacía.");
            return;
        }
        StringBuilder sb = new StringBuilder("Lista doble de inicio a fin:\n");
        NodoD aux = cabD;
        while (aux != null) {
            sb.append(aux.dato).append(" <-> ");
            aux = aux.sig;
        }
        sb.append("null");
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}