/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int velocidade;
    int aceleracion;
    int frenado;
    
    Coche Coche1 = new Coche();
    aceleracion = Integer.parseInt(JOptionPane.showInputDialog("Introduce lo que se acelera"));
    Coche1.acelerar(aceleracion);
    JOptionPane.showMessageDialog(null,"A velocidade �� " +Coche1.getVelocidade());
    
    frenado = Integer.parseInt(JOptionPane.showInputDialog("Introduce lo que se frena"));
    Coche1.frenar(frenado);
    JOptionPane.showMessageDialog(null,"A velocidade �� " +Coche1.getVelocidade());
    }
    
}
