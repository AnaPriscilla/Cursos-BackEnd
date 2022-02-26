/*
    8 - Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
    Calcule e mostre o total do seu salário no referido mês.
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio08 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quanto você ganha por hora? ");
        float valorHora = scan.nextFloat();
        
        System.out.println("Quantas horas você trabalha por mês? ");
        float horasTrabalhadasMes = scan.nextFloat();
        
        float salarioMes = valorHora * horasTrabalhadasMes;
        
        System.out.println("Seu salário no referido mês é de: " + salarioMes);
        
    }
}
