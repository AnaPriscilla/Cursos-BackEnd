/*
1 - Faça um programa que peça dois números e imprima o maior deles.
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio01 {
       
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("_____Digite 2 números______\n");
        
        System.out.print("1º número: ");
        int numero1 = scan.nextInt();
        
        System.out.print("2º número: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2) {
            System.out.println("\nO maior número é: " + numero1);
        } else if (numero2 > numero1) {
             System.out.println("\nO maior número é: " + numero2);
        }
        
    }
    
}
