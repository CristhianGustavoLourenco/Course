/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.CategoriaPessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program30 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<CategoriaPessoa> listCateriaPessoa = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("\nTax payer #" + i + "data:");
            System.out.print("\nIndividual or company (i/c): ");
            char optionPerson = scan.next().charAt(0);
            System.out.print("\nName: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("\nAnual income: ");
            double anualIncome = scan.nextDouble();
            if (optionPerson == 'i'){
                System.out.print("\nHealth Expenditures:: ");
                double healthExpeditures = scan.nextDouble();
                listCateriaPessoa.add(new PessoaFisica(healthExpeditures, nome, anualIncome));
            }else{
                System.out.print("\nNumber of Employees: ");
                int numberEmployees = scan.nextInt();
                listCateriaPessoa.add(new PessoaJuridica(numberEmployees, nome, anualIncome));
            }
        }
        
        System.out.print("TAXES PAID: ");
     
        for(CategoriaPessoa listaPessoas : listCateriaPessoa){
           StringBuilder sb = listaPessoas.mostrarInformacoes();
            System.out.println(sb.toString());
        }
        
        
    }
}
