/*
   4 - Faça um programa que peça as 4 notas bimestrais e mostre a média.
 */
package programacao.aulasbase.exercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio04 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite sua 1ª nota do bimestre: ");
        float nota1 = scan.nextFloat();
        
        System.out.println("Digite sua 2ª nota do bimestre: ");
        float nota2 = scan.nextFloat();
        
        System.out.println("Digite sua 3ª nota do bimestre: ");
        float nota3 = scan.nextFloat();
        
        System.out.println("Digite sua 4ª nota do bimestre: ");
        float nota4 = scan.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("A sua média no bimestre é de: " + media);
        
    }
}
