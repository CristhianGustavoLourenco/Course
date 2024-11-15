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
public class Program10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scan.nextInt();

        Integer[] vectNumero = new Integer[n];

        for (int i = 0; i < vectNumero.length; i++) {
            System.out.print("Digite um numero:");
            vectNumero[i] = scan.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vectNumero.length; i++) {
        
            if(vectNumero[i] < 0){
                System.out.println(vectNumero[i]);
            }
        }
    }
}
