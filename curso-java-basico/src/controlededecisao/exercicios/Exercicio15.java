/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("____________DESCUBRA QUAL TIPO DE TRIANGULO____________");
        
        System.out.print("Digite valor do 1º lado do triângulo: ");
        double lado1 = scan.nextDouble();
        System.out.print("Digite valor do 2º lado do triângulo: ");
        double lado2 = scan.nextDouble();
        System.out.print("Digite valor do 3º lado do triângulo: ");
        double lado3 = scan.nextDouble();
        
        /* 
           Três lados forma um triângulo quando a soma de quaisquer,
           dois lados for maior que o terceiro. 
        */
        
        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("É um triângulo EQUILÁTERO!");
        } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("É um triângulo ESCALENO!");
        } else {
            System.out.println("É um triângulo ISOSCELES!");
        }
        
    }
}