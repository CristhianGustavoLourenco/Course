/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Student;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program05 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        
        System.out.print("Digite o nome do aluno:");
        student.name = scan.nextLine();
        System.out.println();
        
        System.out.print("Digite a Média do 1o Trimestre: ");
        student.note01 = scan.nextDouble();
        System.out.println();
        
        System.out.print("Digite a Média do 2o Trimestre: ");
        student.note02 = scan.nextDouble();
        System.out.println();
        
        System.out.print("Digite a Média do 3o Trimestre: ");
        student.note03 = scan.nextDouble();
        System.out.println();
   
        System.out.printf("Final Grade = %.2f", student.calculeteFinalGrade());
        
        student.studentStatusCheck();

        scan.close();
    }
    
}
