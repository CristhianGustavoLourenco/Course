/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author crist
 */
public class UsedProduct extends ProductGeneric {
    
    private Date manufactureDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public UsedProduct(){
        
    }

    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public StringBuilder priceTag(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.getName());
    sb.append("(Used) $");
    sb.append(String.format("%.2f", super.getPrice()));
    sb.append(" (Manufacture date: ");
    sb.append(sdf.format(manufactureDate));
    sb.append(")");
        return sb;
    }
    
}
