/*
_________CONDICIONAIS_________
Controle de Decisão: IF - ELSE

Anotações sobre o COMANDO IF:
- Comandos dentro de um bloco IF somente são executados se a condição for verdadeira.
- Se a condição for falsa, os comandos não são executados. 

Anotações sobre o COMANDO IF ELSE:
- Comandos dentro de um bloco ELSE somente são executados se a condição do IF for falsa.

Anotações sobre MULTIPLOS IF ELSE:
- É possível ter vários if-else aninhados!
 */
package controlededecisao;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */

public class IfElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Entre com sua idade");
        int idade = scan.nextInt();
        
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }*/
        
        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor 17 - pesquisar mais
        // >= 17 - muito caro
        
        System.out.println("Entre com o preço do item");
        double valor = scan.nextDouble();
        
        if (valor <= 10){
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15){
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else { //valor >= 17
            System.out.println("Muito caro");
        }
    }
}
