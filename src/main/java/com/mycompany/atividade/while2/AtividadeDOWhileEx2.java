/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeDOWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        System.out.println("Digite 0 para encerrar.");

        do {
            System.out.print("Informe a temperatura em Celsius: ");
            celsius = scanner.nextDouble();

            if (celsius != 0) {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.2f°C equivalem a %.2f°F\n", celsius, fahrenheit);
            }

        } while (celsius != 0);  
        
        System.out.println("Programa encerrado.");
        scanner.close(); 
    }
}
