/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("____________BOLETIM GERAL DO ALUNO____________");
        
        System.out.print("Digite sua 1ª nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite sua 2ª nota: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if ( media >= 9 && media <= 10) {
            System.out.println("____________________________");
            System.out.println("1ª Nota: " + nota1);
            System.out.println("2ª Nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Aproveitamento: A ");
            System.out.println("Resultado: APROVADO");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("____________________________");
            System.out.println("1ª Nota: " + nota1);
            System.out.println("2ª Nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Aproveitamento: B ");
            System.out.println("Resultado: APROVADO");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("____________________________");
            System.out.println("1ª Nota: " + nota1);
            System.out.println("2ª Nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Aproveitamento: C ");
            System.out.println("Resultado: APROVADO");
        } else if (media >= 4 && media < 6) {
            System.out.println("____________________________");
            System.out.println("1ª Nota: " + nota1);
            System.out.println("2ª Nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Aproveitamento: D ");
            System.out.println("Resultado: Reprovado");
        } else {
            System.out.println("____________________________");
            System.out.println("1ª Nota: " + nota1);
            System.out.println("2ª Nota: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Aproveitamento: E ");
            System.out.println("Resultado: Reprovado");
        }
    }
}
