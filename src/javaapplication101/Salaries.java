package javaapplication101;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salaries {
     
    
    int id;
    String name;
    double p, m, pf, f;
    double hours, rate, deduction;
    
public void addDetails(int did, String dname, double drate, double dhours, double dd) {
        this.id = did;
        this.name = dname;
        this.rate = drate;
        this.hours = dhours;
        this.deduction = dd;

        
    }
    
    public void viewDetails(){
        double totalGross = rate * hours;
        double netPay = totalGross - (double)deduction;
        
        System.out.printf("%-10d %-20s %10.2f %10.2f %10.2f %-20s %10.2f%n",
                this.id, this.name, rate, hours, totalGross, this.deduction, netPay);
    }
}



