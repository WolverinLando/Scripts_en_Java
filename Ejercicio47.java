/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023 
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: La empresa que fabrica un modelo de maquinas expendedoras de refrescos necesita un programa para estas maquinas que realicebel calculo de cuantas monedas de cada tipo debe devolver. Para ello, en primer lugar, se introducira por teclado la cantidad a devolver en euros (multiplo de 5 centimos, que es la moneda mas pequena de la que se dispone), es decir, se tecleara 1.85 para 1 euro con 85 centimos. Este programa escribira en pantalla cuantas monedas de cada tipo hay que devolver teniendo en cuenta que:
- Se dispone de monedas de 50 centimos, 20 centimos, 10 centimos y 5 centimos.
- Siempre se dispone de las monedas necesarias de cada tipo.
- Se debe devolver el menor numero de monedas posible, es decir, intentar devolver con las de mayor valor */
/* Ejemplo:
Si se introduce la cantidad de 1 euro con 85 centimos, el programa debe imprimir: 3 monedas de 50 centimos,1 moneda de 20 centimos,1 moneda de 10 centimos,1 moneda de 5 centimos.
Si se introduce la cantidad de 1 euro con 20 centimos, el pro-grama debe imprimir:2 monedas de 50 centimos, 1 moneda de 20 centimos, 0 monedas de 10 centimos, 0 monedas de 5 centimos */

import javax.swing.JOptionPane;

public class Ejercicio47 {
    public static void main(String[] args) {
        String cantidadEurosString = JOptionPane.showInputDialog("Ingresa la cantidad a devolver en euros:");
        double cantidadEuros = Double.parseDouble(cantidadEurosString);
        double eurosDevolver = cantidadEuros;

        int centimos50 = (int) (eurosDevolver / 0.5);
        eurosDevolver -= 0.5 * centimos50;

        int centimos20 = (int) (eurosDevolver / 0.2);
        eurosDevolver -= 0.2 * centimos20;

        int centimos10 = (int) (eurosDevolver / 0.1);
        eurosDevolver -= 0.1 * centimos10;

        int centimos5 = (int) (eurosDevolver / 0.05);

        String resultado = "Monedas a devolver:\n" +
                centimos50 + " monedas de 50 centimos.\n" +
                centimos20 + " monedas de 20 centimos.\n" +
                centimos10 + " monedas de 10 centimos.\n" +
                centimos5 + " monedas de 5 centimos.\n";

        JOptionPane.showMessageDialog(null, resultado);
    }
}

