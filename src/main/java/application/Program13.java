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
public class Program13 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce deseja? ");
        int n = sc.nextInt();
        
        int[] vetorNumeros = new int[n];
        int quantidadePares = 0;
        
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.print("\nDigite um numero: ");
            vetorNumeros[i] = sc.nextInt();
            
            if(vetorNumeros[i] % 2 == 0){
                quantidadePares += 1;
            }
        }
        
        int[] vetorPares = new int[quantidadePares];
        
        for(int i = 0; i < vetorNumeros.length; i++){
        
            if(vetorNumeros[i] % 2 == 0){
                
                for(int j = 0; j < vetorPares.length; j++){
                    
                    if(vetorPares[j] == 0){
                        
                        vetorPares[j] = vetorNumeros[i];
                        break;
                    }
                    
                }
            }
            
        }
        
        System.out.print("\nNumeros Pares: ");
        
        for(int i = 0; i < vetorPares.length; i++){
            System.out.print(vetorPares[i] + " | ");
        }
        
        System.out.println("\nQuantidade de Numeros Pares: " + quantidadePares);
    }
}
