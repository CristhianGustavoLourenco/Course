/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Employee;
import entities.EmployeeGeneric;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program28 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        List<EmployeeGeneric> list = new ArrayList<>();
        
        System.out.print("Enter the number of employee: ");
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print("\nEmployee #" + i + " data:");
            System.out.print("\nOutsourced (y/n)? ");
            char ch = scan.next().charAt(0);
            System.out.print("\nName: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("\nHours: ");
            int hours = scan.nextInt();
            System.out.print("\nValue per hour: ");
            double valuePerHour = scan.nextDouble();
            if(ch == 'y'){
               System.out.print("\nAdditional charge: ");
               double additionalCharge = scan.nextDouble();
               list.add(new OutsourcedEmployee(additionalCharge, name, hours, valuePerHour));
            }else{
                list.add(new EmployeeGeneric(name, hours, valuePerHour));
            }
            
            System.out.println("");
            System.out.println("PAYMENTS: ");
            for(EmployeeGeneric emp : list){
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }
        }
        scan.close();
    }
    
}
