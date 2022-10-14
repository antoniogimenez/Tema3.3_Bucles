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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        int num , suma = 0, contador =0;
        
        //TRATAMIENO ESPECIAL DEL PRIMER ELEMENTO
        System.out.println("Dime el numero: ");
        num = Integer.parseInt(s.nextLine());
        suma = suma+num;
        contador++;
        
        while(num != 0){
            System.out.println("Dime un numero: ");
            num = Integer.parseInt(s.nextLine());
            contador++;      //Incrementar el contador
            suma = suma+num;        //Acumulamos suma parcial
        }
        System.out.println("La suma total es: "+suma);
        System.out.println("Hemos introducido: "+(contador-1)+" numeros");
        
//        do{
//            System.out.println("Dime un numero: ");
//            num = Integer.parseInt(s.nextLine());
//            suma = suma+num;
//            contador++;
//        } while(num != 0);
//        System.out.println("La suma total es: "+suma);
//        System.out.println("Hemos introducido: "+(contador-1)+" numeros");
    }
    
}
