/*
6. Leer una secuencia de 30 números y mostrar la suma y el producto de ellos.
 */
package secuencianumerotrescero06;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SecuenciaNumeroTresCero06 {

    public static void main(String[] args) {

        int vector[];
        int resultadoSuma = 0;
        int resultadoProducto = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del vector"));

        vector = new int[numero];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero [" + i + "]: "));

            resultadoSuma = resultadoSuma + vector[i];
            resultadoProducto = resultadoProducto * vector[i];
            //resultadoProducto = numero * vector[i];
            System.out.printf("%s %10s\n","Suma","Producto");
            System.out.printf("%6d %10d\n",resultadoSuma,resultadoProducto);

        }
    }

}
