/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_mcd;

/**
 *
 * @author invitado
 */
public class EVA1_18_MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("EL MCD de 180 y 48 es" + mcd(180,48));
    }
  
    public static int mcd(int num1, int num2){
        int modulo = num1 % num2;
        if(modulo == 0)
            return num2;
        else
            return mcd(num2, modulo);
    }
}
