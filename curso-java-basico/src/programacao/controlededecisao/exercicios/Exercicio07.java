/*
7 - Faça um programa que leia três números e mostre o maior e o menor deles.
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("__________Mostrando MAIOR e MENOR números__________\n");
        
        System.out.print("Digite o 1º número: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o 2º número: ");
        int numero2 = scan.nextInt();
        System.out.print("Digite o 3º número: ");
        int numero3 = scan.nextInt();
        
        System.out.println("_______________________\n");
        
        //MAIOR
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print("O maior número é o " + numero1 + "\n");
        } else if (numero2 > numero3 && numero2 > numero1) {
            System.out.print("O maior número é o " + numero2 + "\n");
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.print("O maior número é o " + numero3 + "\n");
        } 
        
        //MENOR
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.print("O menor número é o " + numero1 + "\n");
        }  else if (numero2 < numero3 && numero2 < numero1) {
            System.out.print("O menor número é o " + numero2 + "\n");
        } else if (numero3 < numero2 && numero3 < numero1) {
            System.out.print("O menor número é o " + numero3 + "\n");
        }
    }
}
