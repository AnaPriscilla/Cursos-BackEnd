/*
3 - Faça um programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
package controlededecisao.exercicios;

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
   
        
        if (letradigitada.equals("F")) {
            System.out.println("Você digitou F - Feminino");
        } else if (letradigitada.equals("M")) {
            System.out.println("Você digitou M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
       
    }
}
