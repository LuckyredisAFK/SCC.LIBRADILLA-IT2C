package javaapplication101;
import java.util.Scanner;

public class Grade {
    
    public void Graden() {
        
//        Grades gn=new Grades();
//        gn.addGrades(1011,"mike", 1.0, 1.0, 1.0, 1.0);
//        gn.viewGrades();
        
        Grades[] gn = new Grades[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of Students: ");
        int nums  = sc.nextInt();
        
        
        
        for(int i=0; i < nums; i++){
            System.out.println("Enter details of student " + (i+1)+":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Prelim ");
            double pr = sc.nextDouble();
            System.out.println("Midtern ");
            double md = sc.nextDouble();
            System.out.println("Pre Final ");
            double pf = sc.nextDouble();
            System.out.println("Final ");
            double f = sc.nextDouble();
            gn[i] = new Grades();
            gn[i].addGrades(id, name, pr, md, pf, f);
        }
        
        for(int i=0; i < nums; i++){
            gn[i].viewGrades();
            
        }
    }
    
}
