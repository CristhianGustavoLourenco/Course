/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program26{
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat formatedBirth = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatterOrder = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date dateBirth = formatedBirth.parse(scan.next());
        
        Client client = new Client(name, email, dateBirth);
        
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());
    
        
        Order order = new Order(01, new Date(), status, client);
        
        System.out.print("How many items to this order? ");
        int cont = scan.nextInt();
        
        for(int i = 1; i <= cont; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Poduct name: ");
            scan.nextLine();
            String nameProduct = scan.nextLine();
            System.out.println("Product Price: ");
            Double priceProduct = scan.nextDouble();
            
            Product product =  new Product(nameProduct, priceProduct);
            
            System.out.println("Quantity: ");
            Integer quantityProduct = scan.nextInt();
            
            OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);
            order.addItem(orderItem);
        }
        
        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);
        
        scan.close();
    }
}
