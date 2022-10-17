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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int pin;
        boolean contraseña = false;
        
        int intentos=0;
        while((intentos>0) && (contraseña)){
            System.out.println("Dime una contraseña: ");
            pin = Integer.parseInt(s.nextLine());
            if(contraseña){
                 intentos++;
            } else{
                System.out.println("Contraseña acertada");
            }
            
            
        }
        
    }
    
}
