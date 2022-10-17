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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("EJERCICIO 4");
        System.out.println("-------------------------");
        
        int num, contador = 0;
        
        System.out.println("Dime el numero del que quieres saber los multiplos: ");
        num = Integer .parseInt(s.nextLine());
        
//        int i=0;
//        do{
//            System.out.println(i);
//            i=i+5;
//        } while (i<=50);
//        System.out.println("Los multiplos de "+num+" son "+contador);
        
//        for(int i = 0;i <= 10;i=i+5){
//            System.out.println(i);
//        }
        
//        while(i<=50){
//            System.out.println(i);
//            i=i+5;
//        }
            
          for(int i=100;i>50;i--){
              if(i%2==0){
                  System.out.println(i);
              }
          }

    }
    
}
