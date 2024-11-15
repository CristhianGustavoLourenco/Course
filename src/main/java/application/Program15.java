/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Pensionista;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program15 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Pensionista[] vetorQuartos = new Pensionista[10];
        
        System.out.print("Quantas pessoas irao hospedar nos quartos?");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print("\nPensionista #" + i + ":");
            System.out.print("\nName:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("\nEmail:");
            String email = sc.nextLine();
            System.out.print("\nQuarto: ");
            int numeroQuarto = sc.nextInt();
            
            vetorQuartos[numeroQuarto] = new Pensionista(nome, email);
        }
        
        System.out.println();
        System.out.print("Quartos Ocupados:\n");
        
        for(int i = 0; i < 10; i++){
            if(vetorQuartos[i] != null){
                System.out.println(i + ": " + vetorQuartos[i]);
            }
        }
        
        sc.close();
    }
}
