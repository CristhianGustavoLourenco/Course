/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o numero de linhas da Matriz: ");
        int n = scan.nextInt();
        System.out.print("\nDigite o numero de colunas da Matriz: ");
        int m = scan.nextInt();

        int[][] MatrizNumeros = new int[n][m];

        for (int i = 0; i < MatrizNumeros.length; i++) {
            for (int j = 0; j < MatrizNumeros[i].length; j++) {
                System.out.print("\n[" + (i) + "]" + "[" + (j) + "] Digite um numero: ");
                MatrizNumeros[i][j] = scan.nextInt();
            }
        }

        System.out.println("MATRIZ GERADA:\n");

        for (int i = 0; i < MatrizNumeros.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < MatrizNumeros[i].length; j++) {
                System.out.print(MatrizNumeros[i][j] + " | ");
            }
            System.out.println("");
        }

        System.out.print("\nDigite um numero para analisarmos: ");
        int numeroPosicao = scan.nextInt();

        for (int i = 0; i < MatrizNumeros.length; i++) {
            for (int j = 0; j < MatrizNumeros[i].length; j++) {
                if (numeroPosicao == MatrizNumeros[i][j]) {

                    if (i > 0) {
                        System.out.println("\nNumero a Cima: " + MatrizNumeros[i - 1][j]);
                    }
                    if (i < MatrizNumeros.length - 1) {
                        System.out.println("\nNumero a Baixo: " + MatrizNumeros[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("\nNumero a Esquerda: " + MatrizNumeros[i][j - 1]);
                    }
                    if (j < MatrizNumeros[i].length - 1) {
                        System.out.println("\nNumero a Direita: " + MatrizNumeros[i][j + 1]);
                    }
                }
            }
        }
    }
}
