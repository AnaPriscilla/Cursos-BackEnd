/*
 Operadores Relacionais
Obs: Sempre que usamos operadores relacioneis o resultado (resultado) vai ser um boolean
 */
package cursojava.aula13operadores;

/**
 *
 * @author User
 */
public class OperadoresRelacionais {
    public static void main (String[] args){
        
        int valor1 = 1;
        int valor2 = 2;
        
        System.out.println("valor1 == valor2 " + (valor1 == valor2));
        System.out.println("valor1 != valor2 " + (valor1 != valor2));
        System.out.println("valor1 > valor2 " + (valor1 > valor2));
        System.out.println("valor1 >= valor2 " + (valor1 >= valor2));
        System.out.println("valor1 < valor2 " + (valor1 < valor2));
        System.out.println("valor1 <= valor2 " + (valor1 <= valor2));
    }
}
