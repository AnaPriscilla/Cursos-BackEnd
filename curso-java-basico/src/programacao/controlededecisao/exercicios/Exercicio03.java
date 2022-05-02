/*
3 - Faça um programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("________Verificar letra digitada________");
        
        System.out.print("Digite F ou M: ");
        String letradigitada = scan.nextLine();
   
        //String tem o próprio método para fazer a comparação
        //utilizando o equals e nesse caso o equalsIgnoreCase (maiusculo e minusculo)
        
        if (letradigitada.equalsIgnoreCase("F")) {
            System.out.println("Você digitou F - Feminino");
        } else if (letradigitada.equalsIgnoreCase("M")) {
            System.out.println("Você digitou M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
       
    }
}
