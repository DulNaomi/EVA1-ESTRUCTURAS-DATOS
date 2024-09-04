/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_arreglo_inmutable;

/**
 *
 * @author invitado
 */
public class EVA1_10_ARREGLO_INMUTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int datos[] = new int [5];
        int temp[];
        temp = datos;
        System.out.println(datos);
        datos[0] = 100;
        datos[1] = 200;
        datos[2] = 300;
        datos[3] = 400;
        datos[4] = 500;
        for (int dato : datos) {
            System.out.println("[" + dato + "]");
        }
        System.out.println("");
        datos = new int[6];
            System.out.println(datos);
        datos[5] = 600;
        
        for (int i = 0; i < temp.length; i++) {
            datos[i] = temp[i];
            
        }
        
        for (int dato : datos); {
            System.out.println("[" + datos + "]");
        }
                    
        }

    }
    

