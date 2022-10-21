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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        
        String num;
        int buenaSuerte = 0, malaSuerte = 0;
        System.out.println("Dime un numero: ");
        num = s.nextLine();
        
        while(!num.equals(" ")){
            
        for (int i=0; i<num.length();i++){
            char caracter = num.charAt(i);
//            switch (caracter){
//                case 2,5,8: 
//                    System.out.println("Buena suerte");
//                    break;
//                case 1,3,4,6,7,9,0: 
//                    System.out.println("Mala suerte");
//                    break;
//                default: System.out.println("***FIN***");
//            }
            System.out.println(""+caracter);
            if ((num.charAt(i) == '2') || (num.charAt(i) == '5') || (num.charAt(i) == '8')){    //Tenemos que poner comillas simples porque es un caracter
                System.out.println("Buena suerte");
                buenaSuerte++;      //Utilizamos el contador porque necesitamos saber 
                                   //cuantos numero son eso o no y que los acumule en esa variable
            } else {
                System.out.println("Mala suerte");
                malaSuerte++;
            }

        }
        if (malaSuerte < buenaSuerte){
                System.out.println("El numero es afortunado...✌");
            } else {
                System.out.println("El numero es de Mala Suerte...lo sentimos");
        }
        System.out.println("Dime un numero: ");
        num = s.nextLine();
        }    
        System.out.println("----FIN----");
    }
    
}
