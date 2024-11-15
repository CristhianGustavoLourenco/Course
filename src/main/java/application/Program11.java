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
public class Program11 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        
        int n = sc.nextInt();
        
        Integer[] vetorNumeros = new Integer[n];
        
        int resultado = 0;
        
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.print("Digite um numero: ");
            vetorNumeros[i] = sc.nextInt();
            
            resultado += vetorNumeros[i];
        }
        
        System.out.print("Valores: ");
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.print(vetorNumeros[i] + " | ");
        }
        
        System.out.println("\nSoma = " + resultado);
        
        resultado /= vetorNumeros.length;
        
        System.out.println("Media = " + resultado);
        
    }
}
