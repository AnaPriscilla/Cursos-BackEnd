/*
COMANDO WHILE:
- Esse comando avalia uma expressão e caso verdadeira executa o bloco
  dentro do comando while.
 */
package programacao.loops;

/**
 *
 * @author anapriscilla
 */
public class ComandoWhile {
    public static void main(String[] args) {
        
        int i = 1; //count ou cont
        int max = 10;
        
        System.out.println("Contando até " + max);
        
        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1; ou i += 1;

        }
    }
}
