/*
    14 - Faça um programa que peça tamanho de um arquivo para download (em MB) e a
    velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado 
    de download do arquivo usando este link (em minutos).
 */
package cursojava.exerciciosProgramacaoBasica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio14 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual o tamanho do arquivo para download? ");
        float arquivoDownload = scan.nextFloat();
        
        System.out.println("Qual a velocidade do link da internet? ");
        float velocidadeInternet = scan.nextFloat();
        
        float tempo = (arquivoDownload / velocidadeInternet);
        System.out.println("O tempo de download: " + tempo);
            
    }
}
