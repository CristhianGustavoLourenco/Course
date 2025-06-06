/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class DadosFuncionario01 {

    private Integer id;
    private String name;
    private Double salary;
    
    public DadosFuncionario01(){
        
    }

    public DadosFuncionario01(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public void increaseSalary(double percentage){
         salary += salary * percentage / 100.0;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return id + " - " + name + ", " + String.format("%.2f", salary);
    }
    
    
}
