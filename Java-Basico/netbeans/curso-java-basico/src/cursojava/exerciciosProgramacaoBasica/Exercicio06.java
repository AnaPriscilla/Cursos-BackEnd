/*
    6 - Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio06 {
    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);
       
        System.out.println ("---Descobrindo a área de um círculo---");
        
        System.out.println("Qual a raio do círculo: ");
        double raio = scan.nextDouble();
        
        double pi = 3.1416;
        
        double area = pi * (raio * raio);
        
        System.out.println("A área do círculo é: " + area);
       
       /* Ou
       System.out.println("Escreva o valor do raio");
       Scanner scan = new Scanner(System.in);

       double raio = scan.nextFloat();
       double area = Math.PI * raio * raio;

       System.out.println("O valor da area é " + area);
       */
    }
}
