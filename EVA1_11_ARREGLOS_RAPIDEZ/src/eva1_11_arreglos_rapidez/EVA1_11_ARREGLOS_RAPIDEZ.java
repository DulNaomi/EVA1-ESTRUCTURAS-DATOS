/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_arreglos_rapidez;

/**
 *
 * @author invitado
 */
public class EVA1_11_ARREGLOS_RAPIDEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tarda 20 segundos en llenar el arreglo
        int[] arreglo = new int [1000000000];
        for(int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    
}
