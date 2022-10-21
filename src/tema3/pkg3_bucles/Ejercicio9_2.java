/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg3_bucles;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        for(int min=0;min<=2;min++){      // este for seri el bucle externo
            for(int seg = 0;seg<=59;seg++){       //este for seria el bucle interno
                
                // Imprimo los minutos y segundos
                // Si estoy en los 10 primeros segundos, le añado un 0 a la salida que salgan los digitos
                if (seg>=0 && seg<=9){
                    System.out.println(min+":0" + seg);
                }
                else{
                     System.out.println(min+":"+seg);
                }
                try{
                    Thread.sleep(1*1000); //Dormimos 1000 miliseg
                }
                catch (Exception e){
                    System.out.println(e);
                }
                if (seg == 0 && min == 2){
                    break;
                }
            }
        }
    }
    
}
