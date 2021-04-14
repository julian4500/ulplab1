/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julian Martinez <juli450@gmail.com>
 */
public class pruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] numeros={1,2,3,4,5,6};
       int [][] arreglos={{2,4,5,3,6},{23,45,67,78},{34,2,1,2,45,56,56}};
        
        Arreglo.sumarLista(numeros); 
        Arreglo.buscarMayor(arreglos);
        Arreglo.cuentaVocales("Pirulo");
        Arreglo.cuentaCaracter("Zaraza", 'z');
}
}
