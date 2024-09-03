/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_arreglos.pkg2;

/**
 *
 * @author invitado
 */
public class EVA1_7_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INT[] X,Y,Z; --> TODAS SON ARREGLOS
                //INT X,Y[], Z; --> SOLO Y ES ARREGLOS
           int[] datos = new int[10];
           //llenar con valores aleatorios:
           for (int i = 0; i < datos.length; i++){
                   //genera valores aleatorios
                   //entre 0 y 1
               datos [i] = (int) (Math.random() * 100);
                       }
                        for (int i = 0; i < datos.length; i++){
                            System.out.print("[" + datos[i] + "]");
                        }

           }
           }
    
    

