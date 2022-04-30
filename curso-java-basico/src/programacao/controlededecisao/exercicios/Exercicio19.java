/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("——— PAR-OU-IMPAR ? | POSITIVO-OU-NEGATIVO ? - AMBOS? - ———");
        System.out.println("--- - -  -- - - - -- -> Basta Escolher <- -- - - - - -- - - ---\n");
        //Informações de escolha do menu
        System.out.print("[1] Para saber se são números PARES OU IMPARES" + "\n" +
                "[2] Para saber se são números POSITIVOS OU NEGATIVOS" + "\n" +
                "Fez usa escolha? Digite a [opção] aqui: ");
        
        int operacao = scan.nextInt();
        
        switch(operacao){
            //Números Pares ou Impares
            case 1 : {
                System.out.println("___________________________________________\n");
                System.out.print("Digite o 1º número: ");
                int numero1 = scan.nextInt();
                System.out.print("Digite o 2º número: ");
                int numero2 = scan.nextInt();
                
                if ((numero1 % 2) == 0 && (numero2 % 2) == 0) {
                    System.out.println("São números PARES");
                } else if ((numero1 % 3) == 0 && (numero2 % 3) == 0){
                     System.out.println("São números ÍMPARES");
                } else if (((numero1 % 2) == 0) && ((numero2 % 3) == 0)) {
                    System.out.println("O 1º é um número PAR e o 2º é um número ÍMPAR");
                } else if (((numero1 % 3) == 0) && ((numero2 % 2) == 0)) {
                     System.out.println("O 1º é um número ÍMPAR e o 2º é um número PAR");
                } else {
                     System.out.println("São números ÍMPARES");
                }
                
            } break;
             case 2 : {
                //Números Positivos ou Negativos
                System.out.println("___________________________________________\n");
                System.out.print("Digite o 1º número: ");
                int numero1 = scan.nextInt();
                System.out.print("Digite o 2º número: ");
                int numero2 = scan.nextInt();
                
                if (numero1 < 0 && numero2 < 0) {
                    System.out.println("São números NEGATIVOS");
                } else if (numero1 > 0 && numero2 > 0){
                     System.out.println("São números POSITIVOS");
                } else if (numero1 > 0 && numero2 < 0) {
                    System.out.println("O 1º é um número POSITIVO e o 2º é um número NEGATIVO");
                } else {
                     System.out.println("O 1º é um número NEGATIVO e o 2º é um número POSITIVO");
                }
            } break;
        } 
    }
}
