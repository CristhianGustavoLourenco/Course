/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Triangle;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program {
    public static void main(String[] args){
      
        Scanner scan = new Scanner(System.in);
        
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of triangle X:");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        
        System.out.println("Enter the measures of triangle Y:");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();
        

        double areaX = x.area();
        

        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
        
        scan.close();
    }
}
