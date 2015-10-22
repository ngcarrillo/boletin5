/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int Patacas= Integer.parseInt(JOptionPane.showInputDialog("Introduce a cantidade de patacas"));
    int Polbo= Integer.parseInt(JOptionPane.showInputDialog( "Introduce os kg de Polbo"));
    MateriaPrima materiaPrima1 =new MateriaPrima();
    materiaPrima1.EngadirPatacas(Patacas);
    materiaPrima1.EngadirPolbo(Polbo);
    JOptionPane.showMessageDialog(null,"Os kg de patacas son"+materiaPrima1.MostrarPatacas());
    JOptionPane.showMessageDialog(null, "Os kg de polbo son "+materiaPrima1.MostrarPolbo());
    JOptionPane.showMessageDialog(null, "Os cliente que podemos servir patacas son "+materiaPrima1.AmosarClientesPatacas());
    JOptionPane.showMessageDialog (null,"Os clientes os que podemos servir polbo son "+materiaPrima1.AmosarClientesPolbo());
    JOptionPane.showMessageDialog(null, "Os clientes TOTALES os que podemos servir son "+materiaPrima1.AmosarClientesTotales());
    
    
            
    }
    
}
