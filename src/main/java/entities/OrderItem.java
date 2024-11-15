/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author crist
 */
public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {

        return price * quantity;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(product.getName())
                .append(", $")
                .append(String.format("%.2f", price))
                .append(", Quantity: ")
                .append(quantity)
                .append(", Subtotal: $")
                .append(String.format("%.2f", subTotal()));
        return sb.toString();
    }
}
