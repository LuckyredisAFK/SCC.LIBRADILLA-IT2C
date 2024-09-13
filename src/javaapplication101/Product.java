package javaapplication101;

import java.util.Scanner;


public class Product {
    public void Produc() {
    
//        Products pr = new Products();
//        pr.addProduct(10011,"Soap", 20.00, 30, 30);
//        pr.viewProduct();

Products[] pr = new Products[100];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no of products: ");
        int noOfProd = input.nextInt();
        
            for (int i = 0; i < noOfProd; i++) {
                System.out.printf("Enter details of product %d\n", i + 1);
                
                System.out.print("Product ID: ");
                int id = input.nextInt();
                input.nextLine();
                
                System.out.print("Product Name: ");
                String name = input.nextLine();
                
                System.out.print("Price: ");
                double price = input.nextDouble();
                
                System.out.print("Items Sold: ");
                int sold = input.nextInt();
                
                System.out.print("Stock: ");
                int stock = input.nextInt();
                
                pr[i] = new Products();
                pr[i].addProduct(id, name, price, sold, stock);
                
                
            }
        
        for (int i = 0; i < noOfProd; i++) {
            pr[i].viewProduct();
    
}
    }
}
