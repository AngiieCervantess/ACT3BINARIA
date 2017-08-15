/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3busquedas;

/**
 *
 * @author Angelica
 */
public class Binaria {
   
    public static int busquedaBinaria(int  vec[], int x){
  int n = vec.length;
  int centro,inicio=0,end=n-1;
   while(inicio<=end){
     centro=(end+inicio)/2;
     if(vec[centro]==x) return centro;
     else if(x < vec [centro] ){
        end=centro-1;
     }
     else {
       inicio=centro+1;
     }
   }
   return -1;
 }

}
 
   