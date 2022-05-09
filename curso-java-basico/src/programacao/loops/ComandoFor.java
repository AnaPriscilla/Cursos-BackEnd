/*

COMANDO FOR:
- Executa um bloco de código que está dentro do comando for
enquanto uma expressão for verdadeira.
- Muito utilizado na progrmação.

for (inicialização; condição; atualização) {
    //bloco de código
}

 */
package programacao.loops;

/**
 *
 * @author anapriscilla
 */
public class ComandoFor {
    public static void main(String[] args) {
        //EXISTEM VARIAÇÕES DESSE COMANDO
        //1ª "normal"
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }
        
        for (int i = 5; i >= 0; i--) {
            System.out.println("i tem valor: " + i);
        }
        
        //2º com mais de uma variável (separa por ",")
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }
        
        //3º com partes ausentes (NÃO É MUITO COMUM)
        int count  = 0;
        for ( ; count < 10; ) {
            System.out.println("i tem valor: " + count);
            count +=2;
        }
        
        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("i tem valor: " + cont);
        }
        
        // LOOP INFINITO
        // FOR (;; ); é a mesma coisa que um While true, ou seja, o programa nunca irá parar de executar. 
        
        //Loop sem corpo: é mais utilizado para somar valores
        int soma = 0;
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("O valor da soma é " + soma);
        }
        
        //Não utiliza chaves {} somente quando tem 1 (não recomendado) é boa pratica utilizar as {}
        for (int i = 0; i < 5; i++) 
            System.out.println("i tem valor: " + i);
        
        //Loop melhorado ... utilizado com Arrays
    }
}
