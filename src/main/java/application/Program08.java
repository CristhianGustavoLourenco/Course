/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program08 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        double[] vect = new double[n];
        
        for (int i = 0; i < n; i++){
            vect[i] = scan.nextDouble();
        }
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / n;
        
        System.out.println("AVERAGE HEIGHT: " + avg);
        
        scan.close();
        
    }
    
}
