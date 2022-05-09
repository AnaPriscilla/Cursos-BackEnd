/*
https://pt2.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
 */
package programacao.loops.exercicios;

import java.util.Scanner;

/**
 *
 * @author anapriscilla
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean infoValidas = false;
        //Boa prática é declarar as variaveis fora do loop
        String nomeUsuario;
        String senha;
        
        do {
            System.out.println("Entre com o nome do usuário: ");
            nomeUsuario = scan.next();
            System.out.println("Ente com a senha: ");
            senha = scan.next();
            
            if (nomeUsuario.equalsIgnoreCase(senha)) {
                //infoValidas = false;
                System.out.println("Senha igual ao usuário! Digite novamente!");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuário válidos");
            }
        } while (!infoValidas);
    }
}
