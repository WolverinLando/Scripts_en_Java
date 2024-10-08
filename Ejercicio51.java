/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Convertir una cadena de texto a mayuscula */

import javax.swing.JOptionPane;

public class Ejercicio51 {
    public static void main(String[] args) {
        String Texto, Mayuscula;
        Texto = JOptionPane.showInputDialog("Ingresa la cadena de texto: ");
        // Con este metodo convertimos una cadena a mayuscula
        Mayuscula = Texto.toUpperCase();
        JOptionPane.showMessageDialog(null,"Texto en mayuscula: "+ Mayuscula);
    }
}

