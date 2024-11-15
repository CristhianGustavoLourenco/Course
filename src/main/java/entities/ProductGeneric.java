/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class ProductGeneric {
    
    private String name;
    private Double price;
    
    public ProductGeneric(){
        
    }

    public ProductGeneric(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    

    public StringBuilder priceTag(){
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append(" $");
    sb.append(String.format("%.2f", price));
        return sb;
    }
    
}
