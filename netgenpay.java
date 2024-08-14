package javaapplication101;
import java.util.Scanner;
import java.text.DecimalFormat;


public class netgenpay {
    public void netGen() {
        
     Scanner input = new Scanner(System.in);
     DecimalFormat deci = new DecimalFormat("₱#,###.00");
     
     String name;
     String date;
     int age, rate, work, deduction;
     double salary;
     
        System.out.print("Enter Date: ");
        date = input.nextLine();
     
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your age:");
        age = input.nextInt();
        
        System.out.print("Enter Rate per Hour: ");
        rate = input.nextInt();
        
        System.out.print("Enter total hours worked: ");
        work = input.nextInt();
        
        System.out.print("Enter total deduction: ");
        deduction = input.nextInt();
        
        System.out.println("----------------------------------------");
        
        System.out.println("Name:"+ date);
        System.out.println("Name:"+ name);
        System.out.println("Age:"+age);
        
        double totalGross = rate * work;
        System.out.println("Total Gross:"+deci.format(totalGross));
        System.out.println("Deduction: "+deci.format(deduction));
        
        System.out.println("----------------------------------------");
        
        double netPay = totalGross - (double)deduction;
        System.out.println("Netpay: "+deci.format(netPay));
  
        
    }
    
}

