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
public class Ejercicio9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int num;
        System.out.println("Dime un numero: ");
        num = Integer.parseInt(s.nextLine());
        int factorial=1;
        for(int i= 1; i<=num;i++){
            factorial = factorial*i;
            for(int j=1;j<=num;j++){
                System.out.print("Operacion "+factorial+"! --->");
                System.out.println(" "+(factorial));
        }
        }
        
    }
    
}
