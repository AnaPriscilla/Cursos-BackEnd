/*
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("__________COMPRAR-CARNE__________");
        
        System.out.print("Escolha o seu tipo de carne: " + "\n" +
                           "[1] Filé Duplo" + "\n" +
                           "[2] Alcatra" + "\n" +
                           "[3] Picanha" + "\n" +
                           "_________________________" + "\n" +
                            "Digite sua escolha: ");
        
        int tipo_carne = scan.nextInt();
        
        switch (tipo_carne) {
            //Filé Duplo
            case 1 : {
                 System.out.print("Qual a quantidade(kg): ");
                double qtcarne = scan.nextDouble();
                System.out.print("Cartão Tabajara? " + "\n" + "Digite [TRUE p/ SIM]" + "\n" + "ou [FALSE p/ Não]: ");
                boolean cartao = scan.nextBoolean();
                
                String tipofile = "Filé Duplo";
                double preco_total_ate = (qtcarne * 4.90);
                double preco_total_acima = (qtcarne * 5.80);
                double desc_cartao_ate = (preco_total_ate * 0.05);
                double desc_cartao_acima = (preco_total_acima * 0.05);
                
                if ((qtcarne <= 5) && (cartao == true)){
                    System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipofile + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_ate + "\n" + 
                            "Tipo de Pagamento..." + " cartão tabajara" + "\n" + 
                            "Valor do Desconto..." + desc_cartao_ate + "\n" +
                            "Valor a Pagar......." + (preco_total_ate - desc_cartao_ate) + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne > 5) && (cartao == true)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipofile + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_acima + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + desc_cartao_acima + "\n" +
                            "Valor a Pagar......." + (preco_total_acima - desc_cartao_acima) + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne <= 5) && (cartao == false)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipofile + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_ate + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + "não tem desconto" + "\n" +
                            "Valor a Pagar......." + preco_total_ate + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne > 5) && (cartao == false)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipofile + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_acima + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + "não tem desconto" + "\n" +
                            "Valor a Pagar......." + preco_total_acima + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                }
                
            } break;
            
            case 2 : {
                //Alcatra
                System.out.print("Qual a quantidade(kg): ");
                double qtcarne = scan.nextDouble();
                System.out.print("Cartão Tabajara? " + "\n" + "Digite [TRUE p/ SIM]" + "\n" + "ou [FALSE p/ Não]: ");
                boolean cartao = scan.nextBoolean();
                
                String tipoalcatra = "Alcatra";
                double preco_total_ate = (qtcarne * 5.90);
                double preco_total_acima = (qtcarne * 6.80);
                double desc_cartao_ate = (preco_total_ate * 0.05);
                double desc_cartao_acima = (preco_total_acima * 0.05);
                
                if (qtcarne <= 5 && cartao == true){
                    System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipoalcatra + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_ate + "\n" + 
                            "Tipo de Pagamento..." + " cartão tabajara" + "\n" + 
                            "Valor do Desconto..." + desc_cartao_ate + "\n" +
                            "Valor a Pagar......." + (preco_total_ate - desc_cartao_ate) + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne > 5) && (cartao == true)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipoalcatra + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_acima + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + desc_cartao_acima + "\n" +
                            "Valor a Pagar......." + (preco_total_acima - desc_cartao_acima) + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne <= 5) && (cartao == false)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipoalcatra + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_ate + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + "não tem desconto" + "\n" +
                            "Valor a Pagar......." + preco_total_ate + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne > 5) && (cartao == false)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipoalcatra + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_acima + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + "não tem desconto" + "\n" +
                            "Valor a Pagar......." + preco_total_acima + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                }
            } break;
            
            case 3 : {
                //Picanha
                System.out.print("Qual a quantidade(kg): ");
                double qtcarne = scan.nextDouble();
                System.out.print("Cartão Tabajara? " + "\n" + "Digite [TRUE p/ SIM]" + "\n" + "ou [FALSE p/ Não]: ");
                boolean cartao = scan.nextBoolean();
                
                String tipopicanha = "Picanha";
                double preco_total_ate = (qtcarne * 5.90);
                double preco_total_acima = (qtcarne * 6.80);
                double desc_cartao_ate = (preco_total_ate * 0.05);
                double desc_cartao_acima = (preco_total_acima * 0.05);
                
                if (qtcarne <= 5 && cartao == true){
                    System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipopicanha + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_ate + "\n" + 
                            "Tipo de Pagamento..." + " cartão tabajara" + "\n" + 
                            "Valor do Desconto..." + desc_cartao_ate + "\n" +
                            "Valor a Pagar......." + (preco_total_ate - desc_cartao_ate) + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne > 5) && (cartao == true)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipopicanha + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_acima + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + desc_cartao_acima + "\n" +
                            "Valor a Pagar......." + (preco_total_acima - desc_cartao_acima) + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne <= 5) && (cartao == false)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipopicanha + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_ate + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + "não tem desconto" + "\n" +
                            "Valor a Pagar......." + preco_total_ate + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                } else if ((qtcarne > 5) && (cartao == false)){
                     System.out.println("****IMPRESSÃO-CUMPOM-FISCAL****" + "\n" +
                            "Tipo de CARNE ......" + tipopicanha + "\n" +
                            "Quantidade.........." + qtcarne + " kg" + "\n" +
                            "Preço TOTAL........." + preco_total_acima + "\n" + 
                            "Tipo de Pagamento..." + " Dinheiro/Outros Cartões" + "\n" + 
                            "Valor do Desconto..." + "não tem desconto" + "\n" +
                            "Valor a Pagar......." + preco_total_acima + "\n" +
                            "Obrigadao e volte sempre!" + "\n");
                }
            } break;
            
            default : {
                 System.out.println("Essa opção não existe");
            } 
        }
    }
}
