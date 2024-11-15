/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.ImportedProduct;
import entities.ProductGeneric;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Program29 {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat formatedDate = new SimpleDateFormat("dd/MM/yyyy");
        List<ProductGeneric> listProduct = new ArrayList<>();

        System.out.print("enter the number of products: ");
        int i = scan.nextInt();

        for (int cont = 1; cont <= i; cont++) {
            System.out.println("\nProduct #"+ i + " data:");
            System.out.print("\nCommun, used or imported (c/u/i): ");
            char tagProduct = scan.next().charAt(0);
            if (tagProduct == 'i') {
                scan.nextLine();
                System.out.print("\nName: ");
                String nameProduct = scan.nextLine();
                System.out.print("\nPrice: ");
                double priceProduct = scan.nextDouble();
                System.out.print("\nCustoms fee: ");
                double FeeProduct = scan.nextDouble();
                listProduct.add(new ImportedProduct(FeeProduct, nameProduct, FeeProduct));
            } else if (tagProduct == 'u') {
                scan.nextLine();
                System.out.print("Name: ");
                String nameProduct = scan.nextLine();
                System.out.print("Price: ");
                double priceProduct = scan.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manuctureDate = formatedDate.parse(scan.next());
                listProduct.add(new UsedProduct(manuctureDate, nameProduct, priceProduct));
            } else {
                scan.nextLine();
                System.out.print("Name: ");
                String nameProduct = scan.nextLine();
                System.out.print("Price: ");
                double priceProduct = scan.nextDouble();
                listProduct.add(new ProductGeneric(nameProduct, priceProduct));
            }
        }
        
        for(ProductGeneric product : listProduct){
            StringBuilder sb = product.priceTag();
            System.out.println(sb.toString());
        }
        scan.close();
    }
}
