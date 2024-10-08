/* Autor:  Orlando Urbano Trejo (Lando)
 * Fecha:  28-07-2023
 * Correo: urbanorlando79@gmail.com
 *
 * Ejercicio: Una compania de refrescos comercializa tres productos: de cola, de naranja y de limon. Se desea realizar un programa que calcule las ventas realizadas de cada producto. Para ello, se leera la cantidad vendida (maximo 5000000) y el precio en euros de cada producto y se mostrara un informe de ventas como el que sigue: */

import javax.swing.JOptionPane;

public class VentasProductos {
	 public static void main(String[] args) {
        float Ventas_Cola, Ventas_Naranja, Ventas_Limon;
        float Precio_Cola, Precio_Naranja, Precio_Limon;
        float Total_Cola = 0, Total_Naranja = 0, Total_Limon = 0, Total_Final = 0;
        String Impresion;

        Ventas_Cola = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de ventas de cola: "));
        Precio_Cola = Float.parseFloat(JOptionPane.showInputDialog("Precio del producto: "));
        Total_Cola = Ventas_Cola * Precio_Cola;

        Ventas_Naranja = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de ventas de naranja: "));
        Precio_Naranja = Float.parseFloat(JOptionPane.showInputDialog("Precio del producto: "));
        Total_Naranja = Ventas_Naranja * Precio_Naranja;

        Ventas_Limon = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad de ventas de limón: "));
        Precio_Limon = Float.parseFloat(JOptionPane.showInputDialog("Precio del producto: "));
        Total_Limon = Ventas_Limon * Precio_Limon;

        Total_Final = Total_Cola + Total_Naranja + Total_Limon;

		  System.out.println("Producto\tVentas\tPrecio\tTotal\n");

		  
        Impresion = "Producto\tVentas\tPrecio Total\n" +
                       "--------------------------------------\n" +
                       "Cola\t\t" + Ventas_Cola + "\t" + Precio_Cola + "\t" + Total_Cola + "\n" +
                       "Naranja\t\t" + Ventas_Naranja + "\t" + Precio_Naranja + "\t" + Total_Naranja + "\n" +
                       "Limon\t\t" + Ventas_Limon + "\t" + Precio_Limon + "\t" + Total_Limon + "\n" +
                       "--------------------------------------\n" +
                       "TOTAL\t\t\t\t" + Total_Final;
 
        System.out.println(Impresion);
    }
}

