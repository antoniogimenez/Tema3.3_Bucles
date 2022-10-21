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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int num;
        
        System.out.println("Dime un numero: ");
        num = Integer.parseInt(s.nextLine());
        
        for (int i = 1;i<=num;i++){     //para cada numero desde 1 hasta num
            
            System.out.println("\nLa tabla de multiplicar de "+i+ " es: ");
            for(int j = 1; j<=10;j++){
                System.out.print("Operacion "+i+ " * "+j+" --->");
                System.out.println(" "+(i*j));
            }
            
        }
        
    }
    
}
