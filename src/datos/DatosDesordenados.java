/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Lesli
 */
public class DatosDesordenados {

    int i, j, temp, pas;

    public DatosDesordenados() {
        this.i = 0;
        this.j = 0;
        this.temp = 0;
    }
    //Metodo burbujaAscendente
    public String burbujaSortAscendente(int[] arreglo) {
        pas = 0;
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
                pas++;
            }
        }
        return mostrarArreglo(arreglo);
    }
    
    public String burbujaSortDescendente(int[] arreglo){
        pas=0;
        for(i=1;i<arreglo.length;i++){
            for(j=0;j<arreglo.length-1;j++){
                if(arreglo[j]<arreglo[j+1]){
                    temp=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temp;
                }
                pas++;
            }
        }
        return mostrarArreglo(arreglo);
}
    //Metodo para ShelLSortAscendente
    public String ShellSortAscendente(int[] arreglo){
        int salto,i,j,k,auxiliar;
        salto=arreglo.length/2;
        while(salto>0){
            for(i=salto;i<arreglo.length;i++){
                j=i-salto;
                while(j>=0){
                    k=j+salto;
                    if(arreglo[j]<=arreglo[k]){
                        j=-1;
                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j-=salto;//j=j-salto;
                    }
                }
            }
            salto=salto/2;
        }       
        return mostrarArreglo(arreglo);
    }
    
    //Método para ShellSortDescendente
    public String ShellSortDescendente(int[] arreglo){
        int salto,i,j,k,auxiliar;
        salto=arreglo.length/2;
        while(salto>0){
            for(i=salto;i<arreglo.length;i++){
                j=i-salto;
                while(j>=0){
                    k=j+salto;
                    if(arreglo[j]>=arreglo[k]){
                        j=-1;
                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j-=salto;//j=j-salto;
                    }
                }
            }
            salto=salto/2;
        }
        return mostrarArreglo(arreglo);
    }
    

    public String mostrarArreglo(int[] arreglo) {
        int k;
        String cadena = "";
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]" + "\n");
            cadena = cadena + (k + 1) + "----->" + "[" + arreglo[k] + "]" + "\n";
        }
        System.out.println("");
        return cadena;
    }

}//FIN CLASE
