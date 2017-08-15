/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package act3busquedas;

import static act3busquedas.Binaria.busquedaBinaria;

/**
 *
 * @author Angelica
 */
public class ACT3BUSQUEDAS {
    
    //Busqueda Binaria
 public static void main(String []args){
  int[]vector ={5,7,9,3,12,17,23,28,34,88};
  int valorBuscado = 88;
  System.out.println(busquedaBinaria(vector,valorBuscado));
 }
 
}

