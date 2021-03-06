/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import datos.DatosDesordenados;

/**
 *
 * @author ALZTeam
 */
public class TestOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DatosDesordenados ordenar= new DatosDesordenados();
        int [] vector = new int[10];
        int cont=1;
        long t, t1,t2; 
        
        System.out.println("1,000 NUMEROS ALEATORIOS ENTRE 0 y 2,000");
        for(int i=0;i<vector.length;i++){
            vector[i]=(((int)(Math.random()*(10-0+1)+0)));
            
        }
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA ASCENDENTE
        t1 = System.nanoTime();
        //BURBUJASORT
        System.out.println("VECTOR NUMEROS DESORDENADOS");
        ordenar.mostrarArreglo(vector);
        System.out.println("\nVECTOR NUMEROS ORDENADOS BURBUJASORT ASCENDENTE");
        ordenar.burbujaSortAscendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String ca= Double.toString(t);
        System.out.println("ns.burbujaSortAscendente: "+ca);
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA DESCENDENTE 
        t1 = System.nanoTime();
        //SHELLSORT
        System.out.println("\nVECTOR NUMEROS ORDENADOS BURBUJASORT DESCENDENTE");
        ordenar.burbujaSortDescendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String c = Double.toString(t);
        System.out.println("ns.burbujaSortDescendente: "+c);
    
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA ASCENDENTE
        t1 = System.nanoTime();
        //SHELLSORT
        System.out.println("\nVECTOR NUMEROS ORDENADOS SHELLSORT ASCENDENTE");
        ordenar.ShellSortAscendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String cadena = Double.toString(t);
        System.out.println("ns.ShellSortAscendente: "+cadena);
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA DESCENDENTE 
        t1 = System.nanoTime();
        //SHELLSORT
        System.out.println("\nVECTOR NUMEROS ORDENADOS SHELLSORT DESCENDENTE");
        ordenar.ShellSortDescendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String cad = Double.toString(t);
        System.out.println("ns.ShellSortDescendente: "+ cad);
        
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA ASCENDENTE
        t1 = System.nanoTime();
        //QUICKSORT
        System.out.println("\nVECTOR NUMEROS ORDENADOS QUICKSORT ASCENDENTE");
        ordenar.QuickAscendente(vector,0,vector.length-1);
        t2 = System.nanoTime();
        t = t2-t1;
        String a = Double.toString(t);
        System.out.println("ns.QuickSortAscendente: "+a);
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA DESCENDENTE 
        t1 = System.nanoTime();
        //QUICKSORT
        System.out.println("\nVECTOR NUMEROS ORDENADOS QUICKSORT DESCENDENTE");
        ordenar.QuickDescendente(vector,0,vector.length-1);
        t2 = System.nanoTime();
        t = t2-t1;
        String b1 = Double.toString(t);
        System.out.println("ns.QuickSortDescendente: "+ b1);
        
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA ASCENDENTE
        t1 = System.nanoTime();
        //RADIX
        System.out.println("\nVECTOR NUMEROS ORDENADOS RADIX ASCENDENTE");
        ordenar.RadixAscendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String lista = Double.toString(t);
        System.out.println("ns.RadixAscendente: "+lista);
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA DESCENDENTE 
        t1 = System.nanoTime();
        //RADIX
        System.out.println("\nVECTOR NUMEROS ORDENADOS RADIX DESCENDENTE");
        ordenar.RadixDescendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String lista1 = Double.toString(t);
        System.out.println("ns.RadixDescendente: "+ lista1);
 
}//FIN MAIN
}//FIN CLASE
