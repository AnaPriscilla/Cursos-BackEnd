/*
4 - Faça um programa que verifique se uma letra digitada é vogal ou consoante.
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("______Verifica letra______");
        
        System.out.print("Digite uma letra: ");
        String letra = scan.next();
       
       //Para contar a quantidade de caracteres é utilizar o método length()
       if (letra.length() > 1) {
           System.out.println("Não é uma letra válida");
       } else {
           switch(letra){
               case "a": System.out.println("É uma vogal"); break;
               case "e": System.out.println("É uma vogal"); break;
               case "i": System.out.println("É uma vogal"); break;
               case "o": System.out.println("É uma vogal"); break;
               case "u": System.out.println("É uma vogal"); break;
               case "A": System.out.println("É uma vogal"); break;
               case "E": System.out.println("É uma vogal"); break;
               case "I": System.out.println("É uma vogal"); break;
               case "O": System.out.println("É uma vogal"); break;
               case "U": System.out.println("É uma vogal"); break;
               default: System.out.println("É uma consoante");
           }
       }
    }
}
