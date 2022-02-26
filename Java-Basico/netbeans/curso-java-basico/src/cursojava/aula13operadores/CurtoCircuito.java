/*
 Tem a ver com a execução do programa java
curto circuito é quando usa-se 2 (&&) ao invés de 1 & (chamado de & simples)
 */
package cursojava.aula13operadores;

/**
 *
 * @author User
 */
public class CurtoCircuito {
     public static void main (String[] args){
         
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);
     }
}
