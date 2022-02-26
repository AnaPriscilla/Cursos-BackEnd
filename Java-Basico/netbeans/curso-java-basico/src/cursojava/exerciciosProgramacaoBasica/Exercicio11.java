/*
11 - Faça um programa que peça 2 números inteiros e um número real. 
    Calcule e mostre:
    a) O produto do dobro do primeiro com metade do segundo.
    b) A soma do triplo do primeiro com o terceiro.
    c) O terceiro elevado ao cubo.
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio11 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("1º - Digite um número inteiro: ");
        int numeroInteiro1 = scan.nextInt();
        
        System.out.println("2º - Digite outro número inteiro: ");
        int numeroInteiro2 = scan.nextInt();
        
        System.out.println("3º - Digite um número real: ");
        float numeroReal = scan.nextFloat();
        
        //Calculo para a letra a)
        int produtoDobroPrimeiro = (numeroInteiro1 * numeroInteiro1);
        int metadeSegundo = produtoDobroPrimeiro + (numeroInteiro2 / 2);
        System.out.println("a) O produto do dobro do primeiro com a metade do segundo: " + metadeSegundo);
        
        //Calculo para a letra b)
        float somaPrimeiroTerceiro = ((numeroInteiro1 * 3) + numeroReal);
        System.out.println("b) A soma do triplo do primeiro com o terceiro: " + somaPrimeiroTerceiro);
        
        //Calculo para a letra c)
        float terceiroElevadoCubo = (numeroReal * numeroReal * numeroReal) ;
        System.out.println("c) O terceiro elevado ao cubo: " + terceiroElevadoCubo);
    }
}
