/*
Revisão da linguagem Java
 */
package cursojava.aula10variaveis;

/**
 *
 * @author anapriscilla
 */
public class Variaveis {
    public static void main(String[] args) {
        
        /*
        CONVENÇÃO JAVA
        int idade = 20;
        String nome = "Ana";
        String nomeDoMeuCachorro = "Cyndi";
        String ano2022 = "2022";
        */
        
        /*
        ACEITO, MAS NÃO UTILIZADO
        int _idade;
        int $idade;
        */
        
        /*
        NÃO É CONVENÇÃO JAVA
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;
        */
       
        String nome; 
        nome = "Ana Priscilla";
        
        int idade;
        idade = 32;
        
        System.out.println("Eu me chamo " + nome);
        System.out.println("e minha idade é " + idade);
        
        /*
        MÁ PRÁTICA
        int a = 10;
        String b = "Ana";
        */
        
    }
}
