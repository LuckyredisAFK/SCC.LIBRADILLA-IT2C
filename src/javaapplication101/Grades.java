package javaapplication101;
import java.util.Scanner;


public class Grades {
    
    int id;
    String name;
    double p, m, pf, f;
    
    public int removeBook(Grades[] gn, int size, int id) {
    for (int i = 0; i < size; i++) {
        if (gn[i].id == id) {
            System.out.printf("\nRemoving book with ID: %d\n", id);
            for (int x = i; x < size - 1; x++) {
            gn[x] = gn[x + 1];
            }
            System.out.println("Book removed successfully.");
            return size - 1;
        }
    }
    System.out.println("Book not found.");
    return size;
}
    
    
    public void editGrades(Grades[] grs, int size, int id){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            if(grs[i].id == id){
                System.out.println("New Prelim Grade: ");
                double sp = sc.nextFloat();
                grs[i].p = sp;
                System.out.println("New Midterm Grade: ");
                double sm = sc.nextFloat();
                grs[i].m = sm;
                System.out.println("New Pre Final Grade: ");
                double spf = sc.nextFloat();
                grs[i].pf = spf;
                System.out.println("New Final Grade: ");
                double sf = sc.nextFloat();
                grs[i].f = sf;
            }
        }
    }
    
    
    public void addGrades(int sid, String sname, double sp, double sm, double spf, double sf){
        this.id = sid;
        this.name = sname;
        this.p = sp;
        this.m = sm;
        this.pf = spf;
        this.f = sf;
        
    }
    
    public void viewGrades(){
        double average = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (average > 3.0)? "PassedFailed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s%n",
                + this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
    }
}
