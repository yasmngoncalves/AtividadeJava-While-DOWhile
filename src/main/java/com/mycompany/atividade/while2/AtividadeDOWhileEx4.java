/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeDOWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorImpares = 0; 

        System.out.println("Insira números inteiros (digite 0 para encerrar):");

        do {
            numero = scanner.nextInt(); 

            if (numero != 0 && numero % 2 != 0) {
                contadorImpares++; 
            }

        } while (numero != 0);  

        System.out.println("Total de números ímpares inseridos: " + contadorImpares);
        scanner.close();  
    }
}
