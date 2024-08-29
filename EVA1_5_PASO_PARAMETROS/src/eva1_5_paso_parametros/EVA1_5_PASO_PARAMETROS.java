/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_paso_parametros;

/**
 *
 * @author invitado
 */
public class EVA1_5_PASO_PARAMETROS {

    
public static void main(String[] args){
    int num = 100;
    System.out.println("num (antes de incremento) =" + num);
    incrementa(num);
    System.out.println("num (antes de incremento) =" + num);
    //paso por referencia (direcciones de memoria)
    Prueba objPrueba = new Prueba();
     System.out.println("Valor de x (antes)= " + objPrueba.x);
    incrementaObj(objPrueba);
    System.out.println("Valor de x (despues) = " + objPrueba.x);
}
    public static void incrementa(int valor) {
   valor++;
    }
  public static void incrementaObj(Prueba objetos){
      objetos.x++;
  }  
}

class Prueba{
    int x =5;
}
