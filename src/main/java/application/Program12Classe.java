/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Pessoa;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program12Classe {
    
    public static void main(String[] args){
        
        int nmenores;
        double alturatotal, alturamedia, percentualMenores;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao Cadastradas?");
        int n = sc.nextInt();
        
        Pessoa[] vetorPessoas = new Pessoa[n];
        
        for(int i = 0; i < vetorPessoas.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            float altura = sc.nextFloat();
            
            vetorPessoas[i] = new Pessoa(nome, idade, altura);
   
        }
        
        nmenores = 0;
        alturatotal = 0;
        for (int i = 0; i < n; i++) {
            if (vetorPessoas[i].getIdade() < 16) {
                nmenores++;
            }
            alturatotal = alturatotal + vetorPessoas[i].getAltura();
        }

        alturamedia = alturatotal / n;
        percentualMenores = ((double) nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturamedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (vetorPessoas[i].getIdade() < 16) {
                System.out.printf("%s\n", vetorPessoas[i].getNome());
            }
        }

        sc.close();
    }
}
