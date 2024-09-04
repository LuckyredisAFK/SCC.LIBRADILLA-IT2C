package javaapplication101;


public class Accounts {
    
    int id;
    String fname, lname, email, uname;

    
public void addAccount(int aid, String afname, String alname, String aemail, String auname){
    
    this.id = aid;
    this.fname = afname;
    this.email = aemail;
    this.uname = auname;
}

public void viewAccount(){
    
    System.out.printf("%-10d %-10s %-10s %-10s%n",
                this.id, this.fname, email, uname);
    
}

public void passwordVer(String passWord){
    
    String specialCharacters = "!@#$%^&*()_+-=[]{}\\|;:'\",./?";
    
    if (passWord.length() < 8) {
    System.out.println("Password must contain 8 characters or more.");
    }
    else if (!passWord.matches(".*[A-Z]*.")){
        
        System.out.println("Password must contain atleast one capitalized letter.");
        
    }
    else if (!passWord.matches(specialCharacters)){
        
        System.out.println("Password must contain atleast one special character.");
    
    }
    else if (! passWord.matches(".*\\d*.")){
        
        System.out.println("Password must contain atleast one number.");
    }
}

    
}
