package javaapplication101;
import java.util.Scanner;

public class Account {
    public void Acc() {
 
    Scanner input = new Scanner(System.in);
    
        System.out.println("Enter no of accounts: ");
        int numAcc = input.nextInt();
        
        for (int i = 0; i > numAcc; i++){
            
            System.out.printf("Enter details of account %d\n", i + 1);
            
            System.out.print("Enter ID: ");
            int id = input.nextInt();
            input.nextLine();
            
            System.out.print("Enter First Name: ");
            String fname = input.nextLine();
            
            System.out.print("Enter Last Name");
            String lname = input.nextLine();
            
            System.out.print("Enter email: ");
            String email = input.nextLine();
            
            System.out.println("Enter Username: ");
            String uname = input.nextLine();
         
            
        }           
}
}
