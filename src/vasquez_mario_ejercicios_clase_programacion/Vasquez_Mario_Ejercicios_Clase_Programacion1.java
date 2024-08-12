/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vasquez_mario_ejercicios_clase_programacion;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Vasquez_Mario_Ejercicios_Clase_Programacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner lea=new Scanner(System.in);
       int menu=0;
     while(menu!=4){
        System.out.println("Menu ");
            System.out.println("1 El ingreso de una palabra e imprimir de manera diagonal");
            System.out.println("2 Piramide de numero");
            System.out.println("3 Listado de Palindromo y No");
            System.out.println("4 Salir ");
            System.out.println("\nElija una de las siguientes opciones: ");
            int opcion = lea.nextInt();
            
           if(opcion==1){
               System.out.print("Ingrese una palabra: ");
                String palabra = lea.next();

                int longitudPalabra = palabra.length();
                int inexterno, inespacios;

                for (inexterno = 0; inexterno < longitudPalabra; inexterno++) {
                    for (inespacios = 0; inespacios < inexterno; inespacios++) {
                        System.out.print(" ");
                    }
                    System.out.println(palabra.charAt(inexterno));
                }

              
                for (inexterno = longitudPalabra - 2; inexterno >= 0; inexterno--) {
                    for (inespacios = 0; inespacios < inexterno; inespacios++) {
                        System.out.print(" ");
                    }
                    System.out.println(palabra.charAt(inexterno));
                }
               
           }
           if(opcion==2){
                int fila, columna, altura, contador;
                System.out.print("Ingresar fila: ");
                 altura = lea.nextInt();

                   for (fila = 1; fila <= altura; fila++) {
                     for (columna = 0; columna < altura - fila; columna++) {
                        System.out.print(" ");
                    }

                        columna = fila;
                        do {
                        System.out.print(columna % 10);
                         columna++;
                     } while (columna <= fila + fila - 1);
                        contador = fila + fila - 2;
                        
                        do {
                            if (contador == 0) {      
                                contador--;
                                } else {
                                
                                System.out.print(contador % 10);
                                contador--;
                       }
                                } while (contador >= fila);

                               System.out.print("\n");
                         }
  
                    }
           
           
           if(opcion==3){
            System.out.print("Ingresar la cantidad de palabras: ");
                int cantidadepalabras = lea.nextInt();

              String palabraspalindromas = "Palindromos:\n";
              String palabrasnonalindromas = "No palindromos:\n";

             for (int inpalabra = 1; inpalabra <= cantidadepalabras; inpalabra++) {
                 System.out.print("Palabra #" + inpalabra + ": ");
                 String palabra = lea.next().toLowerCase();

                String palabrainvertida = "";
                int longitudpalabra = palabra.length();
                int contador = longitudpalabra - 1;

                while (contador >= 0) {
                    char letra = palabra.charAt(contador);
                    palabrainvertida += letra;
                    contador--;
                    }
                

               int espalindromo = 1;
               int indice = 0;
               while (indice < longitudpalabra) {
                   char letraoriginal = palabra.charAt(indice);
                   char letraInvertida = palabrainvertida.charAt(indice);
                   if (letraoriginal != letraInvertida) {
                        espalindromo = 0;
                        break;
                     }
                    indice++;
                     }

                     if (espalindromo == 1) {
                        palabraspalindromas += inpalabra + "- " + palabra + "\n";
              } else {
                    palabrasnonalindromas += inpalabra + "- " + palabra+ "\n";
                 }
               }

                System.out.print(palabraspalindromas);
                System.out.print(palabrasnonalindromas);
           }
           if(opcion==4){
               System.out.println("Hasta pronto...........");
               break;
        }
      }
    } 
}
