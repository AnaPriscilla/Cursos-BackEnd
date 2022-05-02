/*
5 - Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
    - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    - A mensagem "Reprovado", se a média alcançada for menor do que sete;
    - A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
package programacao.controlededecisao.exercicios;
import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("__________Média do Aluno__________");
        System.out.println("Digite a 1ª nota do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a 2ª nota do aluno: ");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
    }
}
