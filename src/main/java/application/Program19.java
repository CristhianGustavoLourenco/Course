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
public class Program19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contador = 0;

        System.out.print("\nDigite o grau da Matriz: ");
        int n = scan.nextInt();

        int[][] MatrizNumeros = new int[n][n];

        for (int i = 0; i < MatrizNumeros.length; i++) {
            for (int j = 0; j < MatrizNumeros[i].length; j++) {
                MatrizNumeros[i][j] = scan.nextInt();
            }
            System.out.println("");
        }

        System.out.println("Números da Diagonal da Matriz: ");
        for (int i = 0; i < n; i++) {
            System.out.print(MatrizNumeros[i][i] + " | ");
        }

        for (int i = 0; i < MatrizNumeros.length; i++) {
            for (int j = 0; j < MatrizNumeros[i].length; j++) {
                if (MatrizNumeros[i][j] < 0) {
                    contador++;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Números negativos: " + contador);

        scan.close();
    }
}
