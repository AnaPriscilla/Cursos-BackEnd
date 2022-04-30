/*
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("_________VENDA DE FRUTAS_________" + "\n"
                            + "Morango .... até 5kg .... R$ 2,50" + "\n"
                            + "Morango .... acima 5kg .. R$ 2,20" + "\n"
                            + "Maçã ....... até 5kg .... R$ 1,80" + "\n"
                            + "Maçã ....... acima 5kg .. R$ 1,50" + "\n"
                            + "_________________________________");
        
        System.out.print( "MENU de Opções: " + "\n" +
                        "[1] para compra de morango: " + "\n" +
                        "[2] para compra de maçã: " + "\n" +
                        "[3] para comprar ambos: " + "\n" + 
                        "______________________________________" + "\n" +
                "Digite aqui: ");
        int compra = scan.nextInt();
        
        switch(compra){
            //MORANGO
            case 1 : {
                System.out.print("Quantidade em kg de Morango: ");
                double morango = scan.nextDouble();
                
                double compra_morango_ate = (morango * 2.50);
                double compra_morango_acima = (morango * 2.20);
                
                double totalcompra = (compra_morango_ate + compra_morango_acima);
                
                 //Compra acima de 8Kg ou total ultrapassar R$ 25,00 = desconto de 10% sobre total.
                if (morango <= 5){
                    System.out.println("Valor a ser pago é de: " + compra_morango_ate);
                } else if (morango > 5 && morango <= 8) {
                    System.out.println("Valor a ser pago é de: " + compra_morango_acima);
                } else if (morango > 8) {
                    System.out.println("Valor a ser pago é de: " + ((compra_morango_acima * 0.10)* compra_morango_acima));
                } else if (totalcompra > 25) {
                    System.out.println("Valor a ser pago é de: " + ((totalcompra * 0.10)* totalcompra));
                }
            } break;
            //MAÇÃ   
            case 2 : {
                System.out.print("Quantidade em kg de Maçã: ");
                double maca = scan.nextDouble();
                
                double compra_maca_ate = (maca * 1.80);
                double compra_maca_acima = (maca * 1.50);
                
                double totalcompra2 = (compra_maca_ate + compra_maca_acima);
                
                if (maca <= 5) {
                    System.out.println("Valor a ser pago é de: " + compra_maca_ate);
                } else if (maca > 5 && maca <= 8) {
                    System.out.println("Valor a ser pago é de: " + compra_maca_acima);
                }  else if (maca > 8) {
                    System.out.println("Valor a ser pago é de: " + ((compra_maca_acima * 0.10)* compra_maca_acima));
                } else if (totalcompra2 > 25) {
                    System.out.println("Valor a ser pago é de: " + ((totalcompra2 * 0.10)* totalcompra2));
                }
            } break;
            
            //AMBOS
            case 3 : {
                System.out.print("Quantidade em kg de Morango: ");
                double morango3 = scan.nextDouble();
                System.out.print("Quantidade em kg de Maçã: ");
                double maca3 = scan.nextDouble();
                
                double compra_morango_ate3 = (morango3 * 2.50);
                double compra_morango_acima3 = (morango3 * 2.20);
                double compra_maca_ate3 = (maca3 * 1.80);
                double compra_maca_acima3 = (maca3 * 1.50);
                
                double soma_morango_maca1 = (compra_morango_ate3 + compra_maca_ate3);
                double soma_morango_maca2 = (compra_morango_acima3 + compra_maca_acima3);
                
                double totalcompra3 = (compra_morango_ate3 + compra_morango_acima3 + compra_maca_ate3 + compra_maca_acima3);

                if (morango3 <= 5 && maca3 <= 5){
                    System.out.println("Valor a ser pago é de: " + soma_morango_maca1);
                } else if (morango3 > 5 && morango3 <= 8 && maca3 > 5 && maca3 <= 8 ) {
                    System.out.println("Valor a ser pago é de: " + soma_morango_maca2);
                } else if (morango3 > 8 && maca3 > 8) {
                    System.out.println("Valor a ser pago é de: " + ((soma_morango_maca2 * 0.10)* soma_morango_maca2));
                } else if (totalcompra3 > 25) {
                    System.out.println("Valor a ser pago é de: " + ((soma_morango_maca2 * 0.10)* soma_morango_maca2));
                }
            } break;
            
            default: System.out.println("Não existe essa opção no Menu");
        }
    }
}
