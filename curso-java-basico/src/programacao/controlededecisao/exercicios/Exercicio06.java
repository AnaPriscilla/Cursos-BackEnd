/*
6 - Faça um programa que leia três números e mostre o maior deles.
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("________Mostrando o maior entre 3 números________");
        
        System.out.print("Digite o 1º número: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o 2º número: ");
        int numero2 = scan.nextInt();
        System.out.print("Digite o 3º número: ");
        int numero3 = scan.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é o " + numero1);
        } else if (numero2 > numero3 && numero2 > numero1){
            System.out.println("O maior número é o " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O maior número é o " + numero3);
        }
    }
}
