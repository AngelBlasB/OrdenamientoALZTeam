/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import datos.DatosDesordenados;

/**
 *
 * @author Lesli
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
        System.out.println("VECTOR NUMEROS ORDENADOS BURBUJASORTASCENDENTE");
        ordenar.burbujaSortAscendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String ca= Double.toString(t);
        System.out.println("ns.burbujaSortAscendente: "+ca);
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA DESCENDENTE 
        t1 = System.nanoTime();
        //SHELLSORT
        System.out.println("VECTOR NUMEROS ORDENADOS BURBUJASORTDESCENDENTE");
        ordenar.burbujaSortDescendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String c = Double.toString(t);
        System.out.println("ns.burbujaSortDescendente: "+c);
    

        
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA ASCENDENTE
        t1 = System.nanoTime();
        //SHELLSORT
        System.out.println("VECTOR NUMEROS ORDENADOS SHELLSORTASCENDENTE");
        ordenar.ShellSortAscendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String cadena = Double.toString(t);
        System.out.println("ns.ShellSortAscendente: "+cadena);
        //ACOMODAR LOS NUMEROS ALEATORIOS DE MANERA DESCENDENTE 
        t1 = System.nanoTime();
        //SHELLSORT
        System.out.println("VECTOR NUMEROS ORDENADOS SHELLSORTDESCENDENTE");
        ordenar.ShellSortDescendente(vector);
        t2 = System.nanoTime();
        t = t2-t1;
        String cad = Double.toString(t);
        System.out.println("ns.ShellSortDescendente: "+ cad);
    
}//FIN MAIN
}//FIN CLASE