/*
    9 - Faça um programa que peça a temperatura em graus Farenheit, 
    transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio09 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual é a temperatura em Farenheit na sua cidade? ");
        double grausFarenheit = scan.nextDouble();
        
        double grausCelsius = (5 * (grausFarenheit - 32) / 9 );
        
        System.out.println("Tranformando a temperatura em Celsius seria de: " + grausCelsius + "ºC");
    }
}
