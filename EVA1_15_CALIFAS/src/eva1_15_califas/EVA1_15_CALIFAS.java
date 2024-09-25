/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_califas;

/**
 *
 * @author invitado
 */
public class EVA1_15_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int[][][] califas;
        int noCarr,noGpos,noAl;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿cuantas carreras son?");
        noCarr = captu.nextInt();
        captu.nextLine();
        
        califas = new int[noCarr][][];
        for (int i = 0; i < califas.length; i++) {
            System.out.println("¿cuantos grupos son de la carrera" + i);
            noGpos = captu.nextInt();
            captu.nextLine();
            califas[i] = new int[noGpos][];
            for (int j = 0; j < califas[1].length; j++) {
            System.out.println("¿cuantos alumnos son de la carrera" + j);
            noGpos = captu.nextInt();
            captu.nextLine();
            califas[i][j] = new int[noAl];
            for (int k = 0; k < califas[i][j].length; k++) {
            System.out.println("¿califa para el alumno" + k +" del grupo " + j + ", de la carrera " + i);
            califas[i][j][k] = captu.nextInt();
            captu.nextLine();
            
            
                
            }
            }
        }
        
    }
    

}