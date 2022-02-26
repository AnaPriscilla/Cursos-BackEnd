/*
    3 - Faça um programa que peça dois números e imprima a soma.
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio03 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o 1º número: ");
        int valor1 = scan.nextInt();
          
        System.out.println("Digite o 2º número: ");
        int valor2 = scan.nextInt();
        
        int resultado = valor1 + valor2;

        System.out.println("A soma desses números é: " + resultado);
        
    }
}
