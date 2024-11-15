/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class Student {

    public String name;
    public double note01, note02, note03;
    
    public double calculeteFinalGrade(){
        return note01 + note02 + note03;
    }
    
    public void studentStatusCheck(){

        if(calculeteFinalGrade() >= 60){
            System.out.println();
            System.out.println("Status: PASS");
        }else{
            System.out.println();
            System.out.println("Status: FAILED");
            System.out.println();
            System.out.println("Missing" + (60 - calculeteFinalGrade()) + "points");
        }
    }
}
