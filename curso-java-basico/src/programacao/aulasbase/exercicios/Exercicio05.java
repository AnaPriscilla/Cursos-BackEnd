/*
    5 - Faça um programa que converta metros para centímetros.
 */
package programacao.aulasbase.exercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio05 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("***CONVERTER METROS EM CENTIMETROS***");
        System.out.println("Digite o valor do metro: ");
        float metros = scan.nextFloat();
        
        float centimetros = metros * 100;
        
        System.out.println("O valor em centimetros é: " + centimetros + " cm");
        
    }
}
