package javaapplication101;
import java.util.Scanner;
import java.text.DecimalFormat;



public class Salary {
    
     public void SalaryGen() {
         
//         Salaries npv = new Salaries();
//         npv.Salaries();

//        Salaries netpayy = new Salaries();
//        netpayy.addDetails(10011,"Soap", 600, 50, 1000);
//        netpayy.viewDetails();
//        
//        Grades gn=new Grades();
              
       Salaries[] netpayy = new Salaries[100];
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of Employees: ");
        int nums  = sc.nextInt();
        
       
        
        for(int i=0; i < nums; i++){
            System.out.println("Enter details of Employees " + (i+1)+":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("rate ");
            double rate = sc.nextDouble();
            System.out.println("hours ");
            double hours = sc.nextDouble();
            System.out.println("deduction ");
            double deduction = sc.nextDouble();
            netpayy[i] = new Salaries();
            netpayy[i].addDetails(id, name, rate, hours, deduction);
        }
                
        
        for(int i=0; i < nums; i++){
            netpayy[i].viewDetails();
        }


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
