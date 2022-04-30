/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("___________REAJUSTES DE SALÁRIO___________\n");
        System.out.println("Informações: \n" +
                "1 - Salários até R$: 280,00 aumento de 20%\n" + 
                "2 - Salários entre R$ 280,00 e 700,00 aumento de 15%\n" + 
                "3 - Salários entre R$ 700,00 e 1500,00 aumento de 10%\n" + 
                "4 - Salários de R$ 1500,00 em diante aumento de 5%\n" + 
                "__________________________________________________\n");
        
        System.out.print("Digite o valor do seu salário atual: ");
        
        double salario = scan.nextDouble();
        
        double salario1 = 280;
        double salario2 = 700;
        double salario3 = 1500;
        
        if (salario < salario1) {
            System.out.println("\n1 - Seu salário teve um aumento de 20% \n" + 
                    "percentual de aumento aplicado foi de: " + (salario * 0.20) +
                    "\ne o novo valor a receber é de:" + " R$ " + ((salario * 0.20) + salario) + "\n");
        } else if (salario >= salario1 && salario <= salario2) {
             System.out.println("\n2 - Seu salário teve um  aumento de 15% \n" +
                    "percentual de aumento aplicado foi de: " + (salario * 0.15) +
                    "\ne o novo valor a receber é de:" + " R$ " + ((salario * 0.15) + salario) + "\n");
        } else if (salario >= salario2 && salario <= salario3 ){
            System.out.println("\n3 - Seu salário teve um  aumento de 10% \n" +
                    "percentual de aumento aplicado foi de: " + (salario * 0.10) +
                    "\ne o novo valor a receber é de:" + " R$ " + ((salario * 0.10) + salario) + "\n");
        }  else {
            System.out.println("\n4 - Seu salário teve um  aumento de 5% \n" +
                    "percentual de aumento aplicado foi de: " + (salario * 0.05) +
                    "\ne o novo valor a receber é de:" + " R$ " + ((salario * 0.05) + salario) + "\n");
        }
    }
}
