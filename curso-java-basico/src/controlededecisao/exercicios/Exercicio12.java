/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("______________CALCULO DE FOLHA DE PAGAMENTO______________");
        
        System.out.print("Digite o valor da sua hora trabalha: ");
        double horatrab = scan.nextDouble();
        System.out.print("Digite a quantidades de horas que trabalhadas no mês: ");
        double horames = scan.nextDouble();
        
        double salariobruto = (horatrab * horames);
        
        //Valores fixos de cobrança do salário
        double inss = (salariobruto * 0.10);
        double fgts = (salariobruto * 0.11);

        
        if (salariobruto <= 900){
            System.out.println("\nSalário Bruto:                           " + "R$ " + salariobruto);
            System.out.println("(-) IR                                   " + "R$ " + "Isento");
            System.out.println("(-) INSS (10%)                           " + "R$ " + inss);
            System.out.println("FGTS (11% - não é descontado)            " + "R$ " + fgts);
            System.out.println("Total de descontos                       " + "R$ " + inss);
            System.out.println("Salário Líquido                          " + "R$ " + (salariobruto - inss));
        } else if (salariobruto  >= 900 && salariobruto <= 1500) {
            System.out.println("\nSalário Bruto:                           " + "R$ " + salariobruto);
            System.out.println("(-) IR   (5%)                            " + "R$ " + (salariobruto * 0.05));
            System.out.println("(-) INSS (10%)                           " + "R$ " + inss);
            System.out.println("FGTS (11% - não é descontado)            " + "R$ " + fgts);
            System.out.println("Total de descontos                       " + "R$ " + ((salariobruto * 0.05) + inss));
            System.out.println("Salário Líquido                          " + "R$ " + (salariobruto - ((salariobruto * 0.05) + inss)));
        } else if (salariobruto >= 1500 && salariobruto <= 2500) {
            System.out.println("\nSalário Bruto:                            " + "R$ " + salariobruto);
            System.out.println("(-) IR   (10%)                            " + "R$ " + (salariobruto * 0.10));
            System.out.println("(-) INSS (10%)                            " + "R$ " + inss);
            System.out.println("FGTS (11% - não é descontado)             " + "R$ " + fgts);
            System.out.println("Total de descontos                        " + "R$ " + ((salariobruto * 0.10)+ inss));
            System.out.println("Salário Líquido                           " + "R$ " + (salariobruto - ((salariobruto * 0.10) + inss)));
        } else {
            System.out.println("\nSalário Bruto:                            " + "R$ " + salariobruto);
            System.out.println("(-) IR   (20%)                            " + "R$ " + (salariobruto * 0.20));
            System.out.println("(-) INSS (10%)                            " + "R$ " + inss);
            System.out.println("FGTS (11% - não é descontado)             " + "R$ " + fgts);
            System.out.println("Total de descontos                        " + "R$ " + ((salariobruto * 0.20) + inss));
            System.out.println("Salário Líquido                           " + "R$ " + (salariobruto - ((salariobruto * 0.20) + inss)));
        }
    }
}
