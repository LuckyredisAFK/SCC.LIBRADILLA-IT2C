package javaapplication101;
import java.util.Scanner;


public class Accounts {
    
    int id;
    String fname, lname, email, uname, password;

    
public void addAccount(int aid, String afname, String alname, String aemail, String auname, String upassword){
    
    this.id = aid;
    this.fname = afname;
    this.lname = alname;
    this.email = aemail;
    this.uname = auname;
    this.password = upassword;
}

public void viewAccount(){
    
    System.out.printf("%-15d %-15s %-15s %-20s %-20s %-20s%n",
                this.id, this.fname, this.lname, this.email, this.uname, this.password);
    

}

public boolean passwordVerifier(String password) {

        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#$%^&-+=()])(?=\\S+$).{8,}$";

        return password.matches(regex);
}
}
    

