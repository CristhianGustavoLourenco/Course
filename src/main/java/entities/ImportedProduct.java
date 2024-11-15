/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class ImportedProduct extends ProductGeneric {
    
    private Double customsFee;
    
    public ImportedProduct(){
        
    }

    public ImportedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public StringBuilder priceTag(){
    StringBuilder sb = new StringBuilder();
    sb.append(super.getName());
    sb.append(" $");
    sb.append(String.format("%.2f", super.getPrice()));
    sb.append(" (Customs fee: $");
    sb.append(String.format("%.2f", customsFee));
    sb.append(")");
        return sb;
    }
    
}
