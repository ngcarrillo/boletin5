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
public class Circulo {
private double radio;
private double Pi = 3.14f;

    public Circulo(){
}
    public Circulo(double radioI){
        radio = radioI;
    }
    public double calcularArea(){
    double area = Pi * Math.pow(radio,2);    
    return area;
    
    }
    
    public double calcularLonxitude(){
    double lonxitude = Pi * radio * 2;
    return lonxitude;
    
    }
    
    public void mostrar() {
    
        JOptionPane.showMessageDialog(null,"A área e "+calcularArea() +"A lonxitude é "+ calcularLonxitude()) ;
    
}
}
