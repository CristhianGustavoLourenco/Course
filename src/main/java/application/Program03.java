/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Rectangle;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle wighth and height: ");
        rectangle.height = scan.nextDouble();
        rectangle.width = scan.nextDouble();
        
        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
        
        scan.close();
    }
    
}
