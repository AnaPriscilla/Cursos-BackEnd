/*
    7 - Faça um programa que calcule a área de um quadrado, 
    em seguida mostre o dobro desta área para o usuário.
 */
package programacao.aulasbase.exercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio07 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor de um lado do quadrado: ");
        float lado = scan.nextFloat();
        
        
        float area = (lado * lado);
        System.out.println("A area do quadrado é: " + area);
        System.out.println("O dobro dessa área é: " + (area * 2));
        
    }
}
