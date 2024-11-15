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
public class Program14 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        
        float[] vetorNumeros = new float[n];
        
        int posicaoMaiorNumero = 0; 
        
        for(int i = 0; i < vetorNumeros.length; i++){
            
            System.out.print("\nDigite um numero:");
            vetorNumeros[i] = sc.nextFloat();
            
            if(i == 0){
                posicaoMaiorNumero = i;
            }else if(vetorNumeros[i] > vetorNumeros[posicaoMaiorNumero]){
                posicaoMaiorNumero = i;
            }
        }
        
        System.out.println("Maior Numero: " + vetorNumeros[posicaoMaiorNumero]);
        System.out.println("Posicao do Maior Numero: " + posicaoMaiorNumero);
    }
}
