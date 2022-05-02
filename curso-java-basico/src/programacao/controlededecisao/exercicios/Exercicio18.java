/*
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("______________DESCOBRINDO-IMPAR-OU-PAR______________\n");
        
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        
        if ((numero % 2) == 0){
            System.out.println("Esse número é PAR! ");
        } else {
            System.out.println("Esse número é IMPAR! ");        
        }
        
    }
}
