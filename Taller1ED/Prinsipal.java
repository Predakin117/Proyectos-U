package taller1;

import javax.swing.*;

public class Prinsipal {
    public static void main(String[] args) {
        String opcion;
        int op, valor, x;
        Metodo l;
        l = new Metodo();
        do {
            opcion = JOptionPane.showInputDialog("Menu de opciones\n"
                    + "1. Notas + Promedio\n"
                    + "2. Matrix 4x4\n"
                    + "3. Suma de matrices 2x2\n"
                    + "4. Matriz transpuesta 3x2\n"
                    + "5. Generar Nodos randoms para lista simple\n"
                    + "6. Generar Nodos randoms para lista doble\n"
                    + "7. Generar Nodos randoms para lista circular\n"
                    + "8. Mostrar lista simple\n"
                    + "9. Mostrar lista doble\n"
                    + "10. Mostrar lista circular\n"
                    + "11. Eliminar Nodo lista simple\n"
                    + "12. Lista circular con nombres\n"
                    + "13. Agregar al final - Lista Doble\n"
                    + "14. Recorrer - Lista Doble\n"
                    + "0. Salir");
            op = Integer.parseInt(opcion);
            switch (op) {
                case 1:
                    l.notasMetodo();
                    break;
                case 2:
                    l.matrixX4();
                    break;
                case 3:
                    l.sumaMatrix();
                    break;
                case 4:
                    l.matrizTranspuesta();
                    break;
                case 5:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Nodos generados"));
                    l.generarNodosSimples(x);
                    break;
                case 6:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Nodos generados"));
                    l.generarNodosDobles(x);
                    break;
                case 7:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Nodos generados"));
                    l.generarNodosCirculares(x);
                    break;
                case 8:
                    l.mostrarListaSimple();
                    break;
                case 9:
                    l.mostrarListaDoble();
                    break;
                case 10:
                    l.mostrarListaCircular();
                    break;
                case 11:
                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor a eliminar"));
                    l.eliminarNodoSimple(valor);
                    break;
                case 12:
                    l.listaCircularNombres();
                    break;
                case 13:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Valor a insertar al final"));
                    l.insertarDobleFinal(valor);
                    break;
                case 14:
                    l.recorrerListaDoble();
                    break;
                case 15:
                    
                    break;
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error la opcion no existe");
            }
        } while (op != 0); 
    }
}