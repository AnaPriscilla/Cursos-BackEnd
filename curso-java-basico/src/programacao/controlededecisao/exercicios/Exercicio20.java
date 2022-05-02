/*
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("————INVESTIGAÇÃO-CRIMINAL————" + "\n" +
                "Digite SIM ou NÃO" + "\n" +
                "RESPONDA AS PERGUNTAS A SEGUIR: " + "\n");
        
        System.out.print("Telefonou para a vítima? ");
        String pergunta1 = scan.next();
        System.out.print("Esteve no local do crime? ");
        String pergunta2 = scan.next();
        System.out.print("Mora perto da vítima? ");
        String pergunta3 = scan.next();
        System.out.print("Devia para a vítima? ");
        String pergunta4 = scan.next();
        System.out.print("Já trabalhou com a vítima? ");
        String pergunta5 = scan.next();
        
        int cont = 0;
        
        if(pergunta1.equalsIgnoreCase("sim")) {
            cont++;
        }
        
        if(pergunta2.equalsIgnoreCase("sim")) {
            cont++;
        }
        
        if(pergunta3.equalsIgnoreCase("sim")) {
            cont++;
        }
        
        if(pergunta4.equalsIgnoreCase("sim")) {
            cont++;
        }
        
        if(pergunta5.equalsIgnoreCase("sim")) {
            cont++;
        }
        
        if(cont == 2){
            System.out.println("Suspeita");
        }else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        }else if (cont == 5) {
            System.out.println("Assassino");
        }else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}
