/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        System.out.println("Números pares de 1 até " + N + ":");

        int i = 2;  
        
        while (i <= N) {
            System.out.print(i + " ");
            i += 2;  
        }

        scanner.close();  
    }
}
