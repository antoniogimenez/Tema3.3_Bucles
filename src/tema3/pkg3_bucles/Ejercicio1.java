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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        //Para el for
        for (int i = 0;i<=10;i++){
            System.out.print("Operacion 5 * "+i+" --->");
            System.out.println(" "+(5*i));
                        
        }
        
        //Igual para el do while
        int i = 0;
        do{
            System.out.print("Operacion 5 * "+ i +" --->");
            System.out.println(" "+(5*i));
            i++;
        } while(i<=10);
        
        //Igual para el while
        while (i<=10){
            System.out.print("Operacion 5 * "+i+" --->");
            System.out.println(" "+(5*i));
            i++;
        }
    }
    
}
