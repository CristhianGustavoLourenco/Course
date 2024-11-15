/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

/**
 *
 * @author crist
 */
public class Program23 {
    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
    }
    
}
