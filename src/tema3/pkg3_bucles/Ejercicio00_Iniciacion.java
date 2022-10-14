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
public class Ejercicio00_Iniciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        System.out.println("**** for ****");
        //primero la inicializa
        //despues la condicion
        //despues incremento o decremento sirve para que vaya aumentando el valor de la i y que se compruebe con todos los valores
//        for (int i = 0; i < 11; i++) {
//            System.out.println("i vale: "+i);            
//        }
//        
//        System.out.println("\n\n**** while ****");
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//        
//        System.out.println("\n\n**** do while ****");
//        i=1;
//        do{
//            System.out.println(i);
//            i++;
//        } while(i<11);
//        
//        //ejercicio
//        System.out.println("\n\n**** Introducir numeros hasta negativo ****");
        
//        int num; 
        
//        System.out.println("----Usando while-----");
//        System.out.println("Numero positivo para continuar: ");
//        num = Integer.parseInt(s.nextLine());
//        
//        while (num>=0) {
//            System.out.println("Numero positivo para continuar: ");
//            num = Integer.parseInt(s.nextLine());
//            
//        }
        
//        System.out.println("-----Usando do...while-----");
//        do{
//            System.out.println("Numero positivo para continuar: ");
//            num = Integer.parseInt(s.nextLine());
//            
//        } while (num>=0);
        
        //Introducir numeros por teclado hasta impar
        System.out.println("**** Introducir hasta impar ****");
//        do{
//            System.out.println("Introduce par para continuar: ");
//            num = Integer.parseInt(s.nextLine());
//            
//        } while (num%2==0);
        
        
        // otra forma
//        int num;
//        System.out.println("Numero par para continuar: ");
//        num = Integer.parseInt(s.nextLine());
//        while (num%2==0) {
//            System.out.println("Numero par para continuar: ");
//            num = Integer.parseInt(s.nextLine());
//            
//        }
        
        // otra forma
//      System.out.println("**** Introducir hasta impar ****");
//        do{
//            System.out.println("Introduce par para continuar: ");
//            num = Integer.parseInt(s.nextLine());
//            if (num%2!=0){
//              break;
            //}
//        } while (true);

        //Usar un for con break. Leer 10 numeros y parar si pongo un impar
//        int num;
//        for (int i=0;i<10;i++){
//            System.out.println("Introduce numeros para continuar: ");
//            num = Integer.parseInt(s.nextLine());
//            if (num%2!=0){
//                break;
//            }
//        }
        
        //imprimir una letra por numero
        
        int ascii_A=65;
        System.out.println("Letra: "+(char)ascii_A);
        
        
        for (int i = 65; i <= 90; i++) {
            System.out.print("Letra: "+(char)i);
            System.out.println("---"+(char)(i+32));
        }
        
        //contadores y acumuladores
//        int num=0;
//        int suma=0;
//        int contador=0;
//        
//        while (num>=0){
//            System.out.println("Introduce un numero: ");
//            num = Integer.parseInt(s.nextLine());
//            if (num>=0){
//                suma = suma+num;    //añado al acumulador
//                contador++;     //incremento alcontador
//            }
//        }
//        System.out.println("La suma acumulada es: "+suma);
//        System.out.println("Total numeros introducidos: "+contador);

        
    }
    
}
