/*
    10 - Faça um programa que peça a temperatura em graus Celsius, 
    transforme e mostre em graus Farenheit. F = C x 1,8 + 32
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio10 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual é a temperado em Cº na sua cidade? ");
        double grausCelsius = scan.nextDouble();
        
        double grausFarenheit =  ((1.8 * grausCelsius) + 32);
        
        System.out.println("Transformando em Farenheit a temperatura é de: " + grausFarenheit + "ºF");
    }
}
