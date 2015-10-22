/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
        Circulo Circulo1 = new Circulo(radio);
        Circulo1.mostrar();
        
          //cambio   
    }
    
}