/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;  

        while (true) {
            System.out.print("Digite um número inteiro ou um negativo para sair: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;  
            }

            soma += numero;  
        }

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close(); 
    }
}
