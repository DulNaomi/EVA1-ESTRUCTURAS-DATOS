/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_for_recursivo;

/**
 *
 * @author invitado
 */
public class EVA1_16_FOR_RECURSIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* for (int i = 5; i > 0; i--) {
            System.out.println(i + " - ");
            
        }*/
        forRecursivo(5);
    }
    public static void forRecursivo(int val){
        System.out.println(val + " - ");
        if(val > 1)
        forRecursivo(val - 1);//esto es recursion
        
    }
    
  public static void forRecursivo(int val, int fin){
        System.out.println(val + " - ");
        if(val < fin)
        forRecursivo(val + 1, fin);//esto es recursion
          
    
}

}
