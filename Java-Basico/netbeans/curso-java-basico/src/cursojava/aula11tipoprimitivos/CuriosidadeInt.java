/*
Curiosidade dos inteiros
 */
package cursojava.aula11tipoprimitivos;

/**
 *
 * @author User
 */
public class CuriosidadeInt {
    public static void main (String[] args) {
        
        int var1 = 2147483647;
        
        int var2 = 100;
        
        System.out.println (var1 + var2);
        
        //Não dá erro, mas imprimi: -2147483549 
        //ao ultrapassar o valor máximo é como uma roleta! 
        //Volta para os valores negativos.
    }
}
