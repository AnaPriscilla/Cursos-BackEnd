/*
8 - Faça um programa que pergunte o preço de três produtos e informe
qual você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("_______Decisão de Compra_______" + "\n");
        
        System.out.println("Preço do 1º produto: ");
        double produto1 = scan.nextDouble();
        System.out.println("Preço do 2º produto: ");
        double produto2 = scan.nextDouble();
        System.out.println("Preço do 3º produto: ");
        double produto3 = scan.nextDouble();
        
        if (produto1 <= produto2 && produto1 <= produto3){
            System.out.println("O 1º produto deve ser comprado é o mais barato!" );
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("O 2º produto deve ser comprado é o mais barato!" );
        } else if (produto3 <= produto2 && produto3 <= produto1) {
            System.out.println("O 3º produto deve ser comprado é o mais barato!" );
        }
    }
}
