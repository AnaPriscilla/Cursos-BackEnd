/*
    2 - Faça um programa que peça um número e então mostre a mensagem O número informado foi [número].
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio02 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Informe um número inteiro: ");
        int numero = scan.nextInt();
        
        System.out.println("O número informado foi " + numero);
    }
}
