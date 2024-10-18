/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_primos;

/**
 *
 * @author Usuario
 */
public class EVA1_19_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static boolean primos2aN(int num) {
        boolean resu = true;
        int modulo = 0;
        for (int i = 2; i < num; i++) {
            modulo = num % i;
            if (modulo == 0)
                resu = false;
            
        }

    }
     public static boolean primos2aRaizN(int num) {
        double raiz = Math.sqrt(num);
        int raizEnt = (int) raiz;
        for (int i = 2; i < raizEnt; i++) {
            
        }
        
    }
}
