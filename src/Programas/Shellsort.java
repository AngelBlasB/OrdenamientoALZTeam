/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author Lesli
 */
public class Shellsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String []  args){
        int n=10;
        int [] v = new int[n];
        for (int i=0; i<n; i++){
            v[i] = (int)(Math.random() * 100) + 1;
        }
        for(int x : v){
            System.out.print(" " + x);
        }
        System.out.println("");
        Shellsort(v);
        for(int x : v){
            System.out.print(" " + x);
        }
        System.out.println("");
    }
    public static void Shellsort(int[]v){
  final int N=v.length;
    int incremento=N;
      do{
        incremento=incremento/2;
         for(int k=0; k< incremento;k++){
             for(int i=incremento +k; i<N; i+=incremento){
                 int j=i;
                 while(j-incremento>= 0 && v[j]<v[j-incremento]){
                     int tmp=v[j];
                     v[j]=v[j-incremento];
                     v[j-incremento]=tmp;
                     j-=incremento;
                 }
             }
         }
         
      }while(incremento >1);
  }
}

