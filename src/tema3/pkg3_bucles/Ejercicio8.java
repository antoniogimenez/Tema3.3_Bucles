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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int num, negativo;
        int i= 0;
        do{
            System.out.println("Dime un numero: ");
            num = Integer.parseInt(s.nextLine());
            // Para hacer una comparacion de caracteres
            if(num>0){ 
                System.out.println("El numero es POSITIVO");
            } else if(num == 0){
                System.out.println("El numero introducido es un 0");
            } else{
                System.out.println("El numero introducido es NEGATIVO");
                negativo = num+i;
            }      
        } while (num != 0);
        negativo = Integer.parseInt(s.nextLine());
        System.out.println("El numero negativo introducido es "+negativo);
    }
    
}
