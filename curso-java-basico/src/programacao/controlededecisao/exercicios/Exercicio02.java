/*
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("______Digite um valor______");
        
        System.out.print("Digite o valor númerico: ");
        double valor = scan.nextDouble();
        
        if (valor >= 0){
            System.out.println("Você digitou um número com valor POSITIVO");
        } else {
            System.out.println("Você digitou um número com valor NEGATIVO");
        }
    }
}
