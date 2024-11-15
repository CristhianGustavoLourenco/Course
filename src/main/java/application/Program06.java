/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.CurrencyConverter;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program06 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double manyDollar, dollarPrice, percentageIOF, total = 0;
        
        System.out.println("What is the dollar price?");
        dollarPrice = scan.nextDouble();
        System.out.println("");
        
        System.out.println("How many dollars will be bought?");
        manyDollar = scan.nextDouble();
        System.out.println("");
        
        System.out.println("What percentage of IOF will be paid (%)?");
        percentageIOF = scan.nextDouble();
        System.out.println("");
        
        total += CurrencyConverter.calculateDollarInRealWithoutIOF(dollarPrice, manyDollar);
        
        total += CurrencyConverter.calculateIOFPaid(dollarPrice, manyDollar, percentageIOF);
        
        System.out.printf("Amount to be paid in reais = %.2f", total);
        
        
        
    }
}
