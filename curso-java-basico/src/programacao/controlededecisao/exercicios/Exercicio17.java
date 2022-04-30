/*
INFORMAÇÕES SOBRE ANO BISSEXTO:
1 - Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero.
2 - Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero.
3 - Pode ser que seja divisível por 400.
 */
package controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("______________DESCOBRINDO-ANO-BISSEXTO______________\n");
        
        System.out.print("Digite um ano qualquer (xxxx): ");
        int anobi = scan.nextInt();
        
        // simbolo % (modulo) resto da divisão
        if ((anobi % 4) == 0 && (anobi % 100) != 0) {
            System.out.println("É ano bissexto");
        } else if ((anobi % 400) == 0) {
            System.out.println("É ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
    }
}
