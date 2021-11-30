/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ALZTean
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
    
    //Radiz ascendente
    public String RadixAscendente(int[] arreglo) {
        int m, i, j;
        for (m = Integer.SIZE - 1; m >= 0; m--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << m >= 0;
//Si m>=0 devuelve un true o un false para asignar en la varible mover el arreglo en la posicion i.
                /*
                 *if(x>y){
                    mayor=x;
                 }else{
                    mayor=y;
                 }
                 Operador Ternario ?
                 resultado=(condicion)? valor1:valor2
                 mayor=(x>y)?x:y;
                 */
                if (m == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[i];
                    j++;
                } else {
                    arreglo[i - j] = arreglo[i];
                }
            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = arreglo[i - j];
            }
            arreglo = auxiliar;
        }
        System.out.println("El arreglo ordenado con Radix es: ");
        return mostrarArreglo(arreglo);
    }
    
    //Metodo RadixDesendente
    public String RadixDescendente(int[] arreglo){
        int m,i,j;
        for(m=Integer.SIZE-1;m>=0;m--){
            int auxiliar[]=new int[arreglo.length];
             j=0;
             for(i=0;i<arreglo.length;i++){
                 boolean mover=arreglo[i] << m<=0;
//Si m<=0 devuelve un true o un false para asignar en la varible mover el arreglo en la posicion i.
                 /*
                 *if(x>y){
                    mayor=x;
                 }else{
                    mayor=y;
                 }
                 Operador Ternario ?
                 resultado=(condicion)? valor1:valor2
                 mayor=(x>y)?x:y;
                 */
                 if(m==0 ? !mover:mover){
                     auxiliar[j]=arreglo[i];
                     j++;
                 }else{
                     arreglo[i-j]=arreglo[i];
                 } 
             }
             for(i=j;i<auxiliar.length;i++){
                 auxiliar[i]=arreglo[i-j];
             }
             arreglo=auxiliar;
        }
        System.out.println("El arreglo ordenado con Radix es: ");
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
