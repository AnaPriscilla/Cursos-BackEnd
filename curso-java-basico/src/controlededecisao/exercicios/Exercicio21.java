/*
 */
package controlededecisao.exercicios;

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
        System.out.print("Digite [1] para A-álcool ou [2] para G-gasolina: ");
        int combustivel = scan.nextInt();
        
        double valcool = (litros * 1.90);
        double vgasolina = (litros * 2.50);
        
        if(litros < 20 && combustivel == 1){
            System.out.println("Valor por litro sem o desconto: " + valcool + "\nSeu desconto é de: " 
                    + (litros * 0.03) + "\nVocê vai pagar: R$ " + ((litros * 0.03) * litros));
        } else if (litros >= 20 && combustivel == 1){
            System.out.println("Valor por litro sem o desconto: " + valcool + "\nSeu desconto é de: " 
                    + (litros * 0.05) + "\nVocê vai pagar: R$ " + ((litros * 0.05) * litros));
        } else if (litros < 20 && combustivel == 2){
            System.out.println("Valor por litro sem o desconto: " + vgasolina + "\nSeu desconto é de: " 
                    + (litros * 0.04) + "\nVocê vai pagar: R$ " + ((litros * 0.04) * litros));
        } else if (litros >= 20 && combustivel == 2) {
            System.out.println("Valor por litro sem o desconto: " + vgasolina + "\nSeu desconto é de: " 
                    + (litros * 0.06) + "\nVocê vai pagar: R$ " + ((litros * 0.06) * litros));
        }
    }
}
