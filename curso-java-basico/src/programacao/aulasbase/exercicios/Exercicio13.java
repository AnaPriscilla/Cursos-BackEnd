/*
    13 - Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
    Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% 
    para o imposto de renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        a) Quanto pagou ao INSS.
        b) Quanto pagou ao sindicato.
        c) O salário líquido.
        d) Calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Salário Líquido : R$ 
        Obs: Salário Bruto - Descontos = Salário Líquido.
 */
package programacao.aulasbase.exercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio13 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Quanto você ganha por hora? ");
        float valorHora = scan.nextFloat();
        
        System.out.println("Qual o número de horas trabalhadas no mês: ");
        float horasTrabalhadasMes = scan.nextFloat();
        
        //Salário Referido/Bruto
        float salarioBruto = (valorHora * horasTrabalhadasMes);
       
        System.out.println("Salário do Bruto do mês: " + salarioBruto);
        
        //Desconto do Imposto de Renda (IR - 11%)
        float descontoImpostoRenda = (float) (salarioBruto * 0.11);
        //Salário pós desconto do IR imposto de renda
        float salarioDescontoIR = (salarioBruto - descontoImpostoRenda);
        
        //Pago ao INSS (8%)
        float descontoINSS = (float) (salarioBruto * 0.08);
        System.out.println("Foi pago ao INSS: " + descontoINSS);
        //Salário pós desconto do INSS
        float salarioDescontoINSS = (salarioDescontoIR - descontoINSS);
        
        //Pago ao Sindicato (5%)
        float descontoSindicato = (float) (salarioBruto * 0.05);
        System.out.println("Foi pago ao sindicato: " + descontoSindicato);
        //Salário pós desconto do Sindicato
        float salarioDescontoSindicato = (salarioDescontoINSS - descontoSindicato);
        
        //Salário Líquido
        float salarioLiquido = (salarioBruto) - (descontoImpostoRenda + descontoINSS + descontoSindicato);
        System.out.println("O valor do salário líquido é de: " + salarioLiquido);
        
        //Calculo dos Descontos e do Salário Liquido
        System.out.println("Salário Bruto : R$ " + salarioBruto + " - IR (11%): R$ " + salarioDescontoIR +
                " - INSS (8%) : R$ " + salarioDescontoINSS + " - Sindicato (5%) : R$ " + salarioDescontoSindicato +
                " = Salário Líquido : R$ " + salarioLiquido);
    }
}
