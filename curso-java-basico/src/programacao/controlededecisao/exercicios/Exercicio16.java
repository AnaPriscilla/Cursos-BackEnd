/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("____________CALCULANDO AS RAÍZES DE UMA EQUAÇÃO____________");
        
        System.out.print("Digite um valor para (a): ");
        int a = scan.nextInt();
        
         if ( a == 0){
            System.out.println("Não é uma equação do 2º grau!"); 
        } else {
            System.out.print("Digite um valor para (b): ");
            int b = scan.nextInt();
            System.out.print("Digite um valor para (c): ");
            int c = scan.nextInt();
            
            int delta = ((b * b) - (4) * (a * c));
            int x = (int) (( - b + (Math.sqrt(delta))) / (2 * a));
            int y = (int) (( - b - (Math.sqrt(delta))) / (2 * a));

            if ( delta < 0 ) {
                System.out.println("A equação não possui raízes reais!");
            } else if ( delta == 0) {
                System.out.println("Possui apenas 1 raíz real que é: " + x);
            } else {
                System.out.println("Possui duas raízes reais: ");
                System.out.println("1ª raíz: " + x);
                System.out.println("2ª raíz: " + y);
            }
        } 
    }
}
