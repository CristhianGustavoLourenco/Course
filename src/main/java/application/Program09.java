/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Product01;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program09 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Product01[] vect = new Product01[n];
        
        for(int i = 0; i < vect.length; i++){
        scan.nextLine();
        String name = scan.nextLine();
        double price = scan.nextDouble();
        vect[i] = new Product01(name, price);
    }
        
        double sum = 0.0;
        
        for(int i = 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }
        
        double avg = sum / n;
        
        System.out.printf("AVERAGE PRICE = %2f%n",avg);
        
        scan.close();
    }
    
}
