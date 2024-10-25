/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDefinido = 24;  
        int palpite;
        int tentativas = 0;  

        System.out.println("Adivinhe o número entre 1 e 100!");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;  

            if (palpite > numeroDefinido) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroDefinido) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Você acertou! O número era " + numeroDefinido + ".");
                System.out.println("Você fez " + tentativas + " tentativa(s).");
                break;  
            }
        }

        scanner.close(); 
    }
}
