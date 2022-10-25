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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        String correo;
        int posicionArroba = 0, posicionPunto = 0;
        boolean tieneArroba = false;
        boolean tienePunto = false;

        
        do{
            System.out.println("Dime una dirreccion de correo: ");
            correo = s.nextLine();
            
            for (int i =0; i<correo.length();i++){
                char caracter = correo.charAt(i);
                System.out.println(caracter);

                if (caracter == ('@')){
                    tieneArroba = true;
                    posicionArroba=i;                
                }
                if (caracter == ('.')){
                    tienePunto = true;
                    posicionPunto =i; // i para guardar la posicion
                }                      
            }
        if (tieneArroba == true && tienePunto == true && posicionArroba < posicionPunto){
                System.out.println("***CORRECTO***");
        } else{
                System.out.println("***INCORRECTO***");
        }
        //Reseteo banderas y contadores
        tieneArroba = false;
        tienePunto = false;
        posicionArroba = 0;
        posicionPunto = 0;
        
        }while(!correo.equals(""));
        
    }
    
}
