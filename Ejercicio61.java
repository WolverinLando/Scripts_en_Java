/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Calcular si un año es bisiesto o no */


import javax.swing.JOptionPane;

public class Ejercicio61 {
    public static void main(String[] args) {
        int Numero;
        Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));
        if (Numero % 4 == 0) {
            JOptionPane.showMessageDialog(null, "Año bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "No es año bisiesto");
        }
    }
}

