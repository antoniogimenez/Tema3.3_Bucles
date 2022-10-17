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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int numPositivo = 0, numNegativo = 0, numCero = 0, num;
        int totalnumeros;
        
        System.out.println("Cuantos numeros quieres mostrar?");
        totalnumeros = Integer.parseInt(s.nextLine());
        
        for(int i= 0;i<totalnumeros;i++){
            System.out.println("Dime un numero: ");
            num = Integer.parseInt(s.nextLine());
            if(num>0){
                numPositivo++;
            } else if(num==0){
                numCero++;
            } else {
                numNegativo++;
            }
        }
        
        System.out.println("Hay "+numPositivo+" numeros positivos");
        System.out.println("Hay "+numNegativo+" numeros negativos");
        System.out.println("Hay "+numCero+" numeros ceros");

        
    }
    
}
