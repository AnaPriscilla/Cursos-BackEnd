/*
9 - Faça um programa que leia três números e mostre-os em ordem decrescente.
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
         
         System.out.println("_____________Ordenação dos Números_____________");
         System.out.println("Digite em ordem crescente" + "\n");
         
         System.out.print("Digite o 1º número: ");
         int numero1 = scan.nextInt();
         System.out.print("Digite o 2º número: ");
         int numero2 = scan.nextInt();
         System.out.print("Digite o 3º número: ");
         int numero3 = scan.nextInt();
         
         System.out.println("-------------Ordem Decrescente-------------");
         
         if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3){
             System.out.println(numero1);
             System.out.println(numero2);
             System.out.println(numero3);
         } else if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1){
             System.out.println(numero3);
             System.out.println(numero2);
             System.out.println(numero1);
         } else {
             System.out.println("Erro: Desordenada");
         }
    }
}
