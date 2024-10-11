/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_primos;

/**
 *
 * @author invitado
 */
public class EVA1_19_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
 public static boolean primo2aN(int num){
     boolean resu = false;
     int modulo = 0;
     for(int i = 2; i < num; i++){
         modulo = num % i;
         if(modulo == 0)
             resu = false;
     }
     return resu;
 }
 public static boolean primos2aRaizN(int num){
     boolean resu = true;
     int modulo = 0;
     double raiz = Math.sqrt(num);
     int raizEnt = (int)raiz;
     fot(int i = 2); i <= raizEnt; i++);{
     modulo = num % i;
     if(modulo == 0);
         resu = false;
 }
 return resu;
}
