/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.AccountBank;
import entities.BusinessAccountBank;
import entities.SavingsAccount;

/**
 *
 * @author crist
 */
public class Program27 {
    
    public static void main(String[] args){
        
        AccountBank acc = new AccountBank(1001, "Alex", 0.00);
        BusinessAccountBank bacc = new BusinessAccountBank(1002, "Maria", 0.00, 500.0);
        
        AccountBank acc1 = bacc;
        AccountBank acc2 = new BusinessAccountBank(1003,"Bob",0.0,200.0);
        AccountBank acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        AccountBank acc6 = new AccountBank(1001, "Alex", 1000.00);
        AccountBank acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        AccountBank acc8 = new BusinessAccountBank(1003, "Bob", 1000.0, 500.0);
        acc6.withdraw(200.00);
        acc7.withdraw(200.00);
        acc8.withdraw(200.00);
        System.out.println(acc6.getBalance());
        System.out.println(acc7.getBalance());
        System.out.println(acc8.getBalance());
        BusinessAccountBank acc4 = (BusinessAccountBank)acc2;
        acc4.loan(100.0);
        
        if(acc3 instanceof BusinessAccountBank){
            BusinessAccountBank acc5 = (BusinessAccountBank)acc3;
            acc5.loan(200.0);
            System.out.print("Loan!");
        }
        
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        
    }
}
