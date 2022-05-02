/*
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("---------------.TABELA DE DESCONTOS.---------------" + "\n" +
                "ÁLCOOL............... até 20 litros ... DESC de 3%" + "\n" +
                "ÁLCOOL.......... acima de 20 litros ... DESC de 5%" + "\n" +
                "PREÇO DO ÁLCOOL.......... por litro ... R$ 1,90" + "\n" +
                "GASOLINA............. até 20 litros ... DESC de 4%" + "\n" +
                "GASOLINA........ acima de 20 litros ... DESC de 6%" + "\n" +
                "PREÇO DA GASOLINA........ por litro ... R$ 2,50" + "\n" +
                "---------------------------------------------------" + "\n" +
                "_________________CALCULAR DESCONTO_________________");
        
        System.out.print("Digite a quantidade de litros: ");
        double litros = scan.nextDouble();
        System.out.print("Qual o tipo de combustível?" + "\n" +
                "Digite alcool ou gasolina: ");
        String combustivel = scan.next();
        
        double preco_gasolina = 2.50;
        double preco_alcool = 1.90;
        int desconto = 0;
        double total = 0;
        double total_desconto = 0;
        
        if (combustivel.equalsIgnoreCase("alcool")){
            
            if(litros <= 20) {
                desconto = 3;
            } else {
                desconto = 5;
                
            }
            
            total = litros * preco_alcool;
            
        } else if (combustivel.equalsIgnoreCase("gasolina")){
            
            if (litros <= 20){
                desconto = 4;
            } else {
                desconto = 6;
            }
            
            total = litros * preco_gasolina;
        }
        
        total_desconto = (total / 100) * desconto;
        
        double preco_a_pagar = total - total_desconto;

        System.out.println("Valor a ser pago: " + preco_a_pagar);
    } 
}
