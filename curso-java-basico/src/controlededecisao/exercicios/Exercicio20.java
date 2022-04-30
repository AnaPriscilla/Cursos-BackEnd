/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("————INVESTIGAÇÃO-CRIMINAL————" + "\n" +
                "Digite [1] para SIM ou [0] para NÃO" + "\n" +
                "RESPONDA AS PERGUNTAS A SEGUIR: " + "\n");
        
        System.out.print("Telefonou para a vítima? ");
        int pergunta1 = scan.nextInt();
        System.out.print("Esteve no local do crime? ");
        int pergunta2 = scan.nextInt();
        System.out.print("Mora perto da vítima? ");
        int pergunta3 = scan.nextInt();
        System.out.print("Devia para a vítima? ");
        int pergunta4 = scan.nextInt();
        System.out.print("Já trabalhou com a vítima? ");
        int pergunta5 = scan.nextInt();
        
        int resultado = (pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5);
        
        if (resultado == 2) {
            System.out.println("Classificação: SUSPEITO");
        } else if (resultado == 3 || resultado == 4) {
            System.out.println("Classificação: CÚMPLICE");
        } else if (resultado == 5) {
            System.out.println("Classificação: ASSASSINO");
        } else {
            System.out.println("Classificação: INOCENTE");
        }
       
    }
}
