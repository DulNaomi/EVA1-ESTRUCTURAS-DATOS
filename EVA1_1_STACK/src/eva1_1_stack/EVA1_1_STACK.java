/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_1_stack;

/**
 *
 * @author invitado
 */
public class EVA1_1_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
 public static void A(){
     System.out.println("Inicia main A");
     B();
     System.out.println("Termina main A");
 }
 public static void B(){
     System.out.println("Inicia main B");
     System.out.println("Termina main B");
 }
}
