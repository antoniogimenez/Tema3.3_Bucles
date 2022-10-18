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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        char letra;
        
        do{
            System.out.println("Dime una letra: ");
            letra = s.nextLine().charAt(0);
            // Para hacer una comparacion de caracteres
            if((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') ||
               (letra == 'u') || (letra == 'A') || (letra == 'E') || (letra == 'I') || 
               (letra == 'O') || (letra == 'U')){ 
                System.out.println("El caracter introducido es VOCAL");
            } else if(letra == ' '){
                System.out.println("El caracter introducido es un espacio");
            } else{
                System.out.println("El caracter introducido NO ES VOCAL");
            }      
        } while (letra != ' ');
        
    }
    
}
