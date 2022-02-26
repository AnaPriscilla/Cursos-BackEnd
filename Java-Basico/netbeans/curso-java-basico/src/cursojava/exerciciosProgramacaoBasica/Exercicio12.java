/*
    12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
    usando a seguinte fórmula: (72.7*altura)-58
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio12 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("***CALCULANDO SEU PESO IDEAL***");
        System.out.println ("Qual é a sua altura? ");
        double altura = scan.nextDouble();
        
        double pesoIdeal = ((72.7 * altura) - 58);
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
