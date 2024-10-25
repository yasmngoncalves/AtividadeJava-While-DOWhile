/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        int contador = 1;  

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;  
        }

        scanner.close();  
    }
}
