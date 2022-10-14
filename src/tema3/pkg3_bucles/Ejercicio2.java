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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int num, suma=0;
        
        
        System.out.println("Dime un numero: ");
        num = Integer.parseInt(s.nextLine());
        
        for (int i = 0;i<=num;i++){
            suma = suma + i;
        }
        System.out.println("La suma es: "+suma);
//        int i=0;
//        while(num >= i){
//            suma=suma+i;
//            i++;
//        }
//        System.out.println("La suma es: "+suma);
        
        //Segunda parte calcular el factorial
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial = factorial*i;
        }
        System.out.println("El factorial es "+num+" es: "+factorial);
    }
    
}
