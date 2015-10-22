/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin5_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double meridiano = Double.parseDouble(JOptionPane.showInputDialog("Introduce el meridiano"));
       double paralelo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el paralelo"));
       double distanciaTerra = Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia a Terra"));
        Satelite Satelite1 = new Satelite(meridiano, paralelo, distanciaTerra);
       
        Satelite1.verPosicion();
    }
    
}
