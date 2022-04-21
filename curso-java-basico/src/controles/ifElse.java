/*
_________CONDICIONAIS_________
Controle de Decisão: IF - ELSE

Anotações sobre o COMANDO IF:
- Comandos dentro de um bloco IF somente são executados se a condição for verdadeira.
- Se a condição for falsa, os comandos não são executados. 

 */
package controles;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */

public class ifElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com sua idade");
        int idade = scan.nextInt();
        
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        }
    }
}
