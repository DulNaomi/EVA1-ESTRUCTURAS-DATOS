/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA1_13_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[][] matriz = new int [3][2];
         System.out.println(matriz.length);
         System.out.println(matriz [0].length);
         System.out.println(matriz [1].length);
         System.out.println(matriz [2].length);

         
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 matriz [i][j] = (int) (Math.random() * 100)
                 
             }
            
        }


    }
    
}
