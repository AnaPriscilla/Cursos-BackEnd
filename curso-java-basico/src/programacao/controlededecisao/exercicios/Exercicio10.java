/*
10 - Faça um programa que pergunte em que turno você estuda.
Peça para digitar M-matutino ou V-vespertino ou N-noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!", "Boa Noite!" ou
"Valor Inválido!", conforme o caso.
 */
package programacao.controlededecisao.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("__________Turno de Estudo__________");
        
        System.out.print(" - M - para matutino \n" +
                " - V - para vespertindo \n" + 
                " - N - para noturno: " + 
                "\nDigite: ");
        
        String turno = scan.next();
        
        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("V")){
            System.out.println("Bom Tarde!");
        } else if (turno.equalsIgnoreCase("N")){
            System.out.println("Bom Noite!");
        } else {
            System.out.println("Valor Inválido");
        }
    }
}
