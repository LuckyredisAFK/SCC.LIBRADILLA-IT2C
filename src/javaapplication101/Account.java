package javaapplication101;
import java.util.Scanner;

public class Account {
    public void Acc() {
 
    Scanner input = new Scanner(System.in);
    
    Accounts[] accts = new Accounts[100];
    
        System.out.println("Enter no of accounts: ");
        int numAcc = input.nextInt();
        
        for (int i = 0; i < numAcc; i++){
            accts[i] = new Accounts();
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
            
            String password;
            while (true) {
                System.out.print("Enter password: ");
                password = input.nextLine();

                if (accts[i].passwordVerifier(password)) {
                    System.out.println("Password is Valid.");
                    break;
                } else {
                    System.out.println("Invalid password! The password must contain at least:");
                    System.out.println("- Minimum length of 8 characters.");
                    System.out.println("- 1 digit.");
                    System.out.println("- 1 special character.");
                    System.out.println("- 1 uppercase letter");
                }
            }
            accts[i].addAccount(id, fname, lname, email, uname, password);
        }
           
        for (int i = 0; i < numAcc; i++) {
                   accts[i].viewAccount();
        }
        
}
}
