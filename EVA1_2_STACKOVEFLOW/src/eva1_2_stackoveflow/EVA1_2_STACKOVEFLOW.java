/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_stackoveflow;

/**
 *
 * @author invitado
 */
public class EVA1_2_STACKOVEFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         A();
    }
     public static void A(){
         B();
     }
     public static void B(){
         A();
     }
    
}
