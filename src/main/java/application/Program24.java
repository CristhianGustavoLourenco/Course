/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program24 {
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter departament's name:");
        String nameDepartament = scan.nextLine();
        System.out.println("\nEnter worker data: ");
        System.out.print("\nName: ");
        String nameFuncionario = scan.nextLine();
        System.out.print("\nLevel: ");
        String workerLevel = scan.nextLine();
        System.out.print("\nBase Salary: ");
        double baseSalary = scan.nextDouble();
        Worker worker = new Worker(nameFuncionario, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(nameDepartament));
        
        System.out.print("\nHow many contracts to this worker?");
        int n = scan.nextInt();
        
        for(int i = 1; i <=n; i++){
            System.out.print("\nEnter contract #" + i + "data: ");
            scan.nextLine();
            System.out.print("\nDate (DD/MM/YYYY: )");
            Date contractDate = sdf.parse(scan.next());
            System.out.print
        ("\nValue per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("\nDuration (hours): ");
            int hours = scan.nextInt(); 
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        
        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String mounthAndYear = scan.next();
        int month = Integer.parseInt(mounthAndYear.substring(0, 2));
        int year = Integer.parseInt(mounthAndYear.substring(3));
        System.out.print("\nName: "+ worker.getName());
        System.out.print("\nDepartment: " + worker.getDepartament().getName());
        System.out.print("\nIncome for " + mounthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        
        scan.close();
    }
}
