/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Employee;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program04 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Nome: ");
        employee.name = scan.nextLine();
        
        System.out.print("Gross Salary: ");
        employee.grossSalary = scan.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();
        
        System.out.println();
        
        System.out.println("Employee: " + employee);
        
        System.out.println();
        
        System.out.println("Which percentage to increase salary? ");
        double percentage = scan.nextDouble();
        
        while(percentage < 0 || percentage > 100 ){
            
            System.out.println("Invalid value, must be between 0 and 100");
            System.out.print("Please, what percentage to increase the salary? ");
            percentage = scan.nextDouble();
            
        }
        
        employee.increaseSalary(percentage);
        
        System.out.println("Updated data: " + employee);

    }
}
