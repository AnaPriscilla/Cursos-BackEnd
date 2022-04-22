/*
4 - Faça um programa que verifique se uma letra digitada é vogal ou consoante.
 */
package controlededecisao.exercicios;

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
        
        if (letra.equals("a")){
            System.out.println("É uma vogal");
        } else if (letra.equals("e")){
            System.out.println("É uma vogal");
        } else if (letra.equals("i")){
            System.out.println("É uma vogal");
        } else if (letra.equals("o")){
            System.out.println("É uma vogal");
        } else if (letra.equals("u")){
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }
        
    }
}
