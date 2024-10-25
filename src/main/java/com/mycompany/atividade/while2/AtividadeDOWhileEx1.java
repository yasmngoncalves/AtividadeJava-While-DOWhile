/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade.while2;

import java.util.Scanner;

/**
 *
 * @author yasmn
 */
public class AtividadeDOWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Adicionar");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Remover");
                    break;
                case 3:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);  

        scanner.close(); 
    }
}
