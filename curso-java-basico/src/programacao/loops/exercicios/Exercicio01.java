/*
https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
 */
package programacao.loops.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Utilizando FLAG
        boolean nota_valida = false;
        
        //Pode ser feito com while ou do while
        
        do {
            System.out.print("Entre com uma nota: ");
            double nota = scan.nextDouble();


            if (nota >= 0 && nota <= 10) {
                nota_valida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //nota_valida = false;
                System.out.println("Nota inválida, digite novamente!");
            }
        } while(nota_valida == false);
        
        
    }
}
