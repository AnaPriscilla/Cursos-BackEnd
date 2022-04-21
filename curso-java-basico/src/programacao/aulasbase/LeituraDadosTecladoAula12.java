/*
Lendo dados do teclado
 */
package programacao.aulasbase;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LeituraDadosTecladoAula12 {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        /* //1ªs exemplos:
        System.out.println ("Digite seu nome completo: ");
        //Para pegar tudo o que foi digitado scan.nextLine()
        String nomeCompleto = scan.nextLine();
        System.out.println ("Seu nome completo é: " + nomeCompleto);
        
        
        System.out.println ("Digite seu primeiro nome: ");
        //Para somente uma string scan.next()
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
    
        
        System.out.println("Digite a sua idade: ");
        //Para pegar o valor número inteiro scan.nextInt()
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        
        System.out.println("Digite a sua altura: ");
        //Para pegar o valor número com mais casas pós virgula scan.nextDouble()
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);
        */
        
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println ("Você digitou os seguintes valores: ");
        System.out.println ("Primeiro nome: " + primeiroNome);
        System.out.println ("Idade: " + idade);
        System.out.println ("Quantidade de filhos: " + qtdFilhos);
        System.out.println ("Altura: " + altura);
        System.out.println ("Tem bichinho de estimação: " + temPet);
          
    }
    
}
