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
public class MateriaPrima {
    private int kgPatacas;
    private int kgPolbo;
    private int clientesPatacas;
    private int clientesPolbo;
    
  public void EngadirPatacas(int kgPatacasI){
      kgPatacas = kgPatacas + kgPatacasI; // kgPatacas+ = kgpatacasI
  }
  public void EngadirPolbo(int kgPolboI){
      kgPolbo = kgPolbo + kgPolboI;
          }
  
 public int MostrarPatacas(){
     return kgPatacas;
 }
  public int MostrarPolbo(){
      return kgPolbo;
  }
  public int AmosarClientesPolbo(){
     clientesPolbo = kgPolbo * 3/2;
     return clientesPolbo;
  }
  public int AmosarClientesPatacas (){
   clientesPatacas = kgPatacas * 3;
   return clientesPatacas;
   
  } 
  public int AmosarClientesTotales (){
  if (clientesPolbo <= clientesPatacas){
      return clientesPolbo;
  }
  else {
      return clientesPatacas;
  }
  }
}
