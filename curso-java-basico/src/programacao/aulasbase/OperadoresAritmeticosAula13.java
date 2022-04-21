/*
 Operadores Aritiméticos
 */
package programacao.aulasbase;

/**
 *
 * @author User
 */
public class OperadoresAritmeticosAula13 {
    public static void main (String[] args){
        int resultado = 1 + 2;
        System.out.println (resultado);
        
        resultado = resultado - 1;
        System.out.println (resultado);
        
        resultado = resultado * 2;
        System.out.println (resultado);
        
        resultado = resultado / 2;
        System.out.println (resultado);
        
        resultado = resultado + 8;
        System.out.println (resultado);
        
        resultado = resultado % 7;
        System.out.println (resultado);
        
     
        // Existem outras maneiras de desenvolver esse programa,
        // Essa maneira não é muito legal. 
        String primeiroNome = "Está é";
        String segundoNome = " uma string concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println (terceiroNome);
        
        
        resultado = resultado + 1;
        System.out.println (resultado);
        
        //Essa é outra maneira de escrever e significa que está adicionando + 1
        resultado++;
        System.out.println (resultado);
        
        //5
        System.out.println(resultado++);
        //Seria a mesma coisa que imprimir:
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;
        
        System.out.println(++resultado);
        //Seria a mesma coisa que imprimir:
        //resultado += 1;
        //System.out.println (resultado);
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println (resultado--);
        System.out.println(--resultado);
        
    }
}
