/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class CurrencyConverter {
    
    
    public static double calculateIOFPaid(double dollarPrice, double manyDollar, double percentageIOF){
        
        return ((dollarPrice * manyDollar) * percentageIOF) / 100;
    }
    
    public static double calculateDollarInRealWithoutIOF(double dollarPrice, double manyDollar){
        
        return (dollarPrice * manyDollar);
    }
    
    
}
