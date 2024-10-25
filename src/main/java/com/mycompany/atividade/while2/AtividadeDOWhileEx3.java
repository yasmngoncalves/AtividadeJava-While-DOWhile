/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeDOWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        System.out.println("Contagem regressiva:");

        do {
            System.out.println(numero);
            numero--;  
        } while (numero >= 1);  

        System.out.println("Fim da contagem!");
        scanner.close();  
    }
}
