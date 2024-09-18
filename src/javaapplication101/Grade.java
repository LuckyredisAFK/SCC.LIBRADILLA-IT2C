package javaapplication101;
import java.util.Scanner;

public class Grade {
    
    public void Graden() {
        
//        Grades gn=new Grades();
//        gn.addGrades(1011,"mike", 1.0, 1.0, 1.0, 1.0);
//        gn.viewGrades();
        
        Grades[] gn = new Grades[100];
        Scanner sc = new Scanner(System.in);
        
        int nums = 0;
        String op;
        
        do{    
            System.out.println("Welcome to Grading App");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("-------------------------------------");

        System.out.print("Enter Action: ");
        int option = sc.nextInt();
        
        
        while(option > 5){
            System.out.print("Invalid Action. Try Again: ");
            option = sc.nextInt();
        
        }
        
        switch(option){

            case 1:
                System.out.print("Enter no. of Students: ");
                nums = sc.nextInt();
        
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
        break;
        
            case 2:
        
            for(int i=0; i < nums; i++){
            gn[i].viewGrades();      
        }
            break;
            
            case 3:
                System.out.println("Enter the ID to update: ");
                int ids = sc.nextInt();   
                Grades pr = new Grades();
                pr.editGrades(gn, nums, ids);
                
                break;
                
                case 4:
                    Grades sdl = new Grades();
                    System.out.println("Enter the ID to remove: ");
                    ids = sc.nextInt();
                    nums = sdl.removeBook(gn, nums, ids);  
                    break;
    }
   
        
              
        
        
        System.out.println("Do you want to continue?(Y/N): ");
            op=sc.next();
        }while(op.equals("Y")|| op.equals("y"));

    
}
}
