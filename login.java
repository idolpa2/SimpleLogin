import java.util.Scanner;

public class Main{
    
    public static String email="";
    public static String password="";
    public static String name="";
    public static String st_id="";
    public static int login_attempt=5;
    
    public static void main(String[] args)
    {
        
        Operation input = new Operation();
        input.input_info();
        
    }
    
}

class Operation{
    
    public void input_info(){
        String email;
        String password;
        String st_id;
        String name;
        Scanner all = new Scanner(System.in);
        Operation toast = new Operation();
        Login login = new Login();
        toast.showToast("Welcome to account registration page.\nCreate your account.\n");
        System.out.println("Enter your name");
        name = all.nextLine();
        System.out.println("Enter your student ID");
        st_id = all.nextLine();
        System.out.println("Enter your email");
        email = all.nextLine();
        System.out.println("Enter your password");
        password = all.nextLine();
        Main.email = email;
        Main.st_id = st_id;
        Main.password = password;
        Main.name = name;
        toast.showToast("\n\n\n\n\n\nYour account has been created!\nTry login now...\n");
        login.proceess_login();
        
        
    }
    
    
        
    
    
    public void showToast(String text){
        System.out.println(text);
    }
}

class Login{
    
    public void proceess_login(){
        String email;
        String password;
        Scanner all = new Scanner(System.in);
        Operation toast = new Operation();
        Login try_again = new Login();
        if (!(Main.login_attempt==0)){
        
            System.out.println("Enter your email");
            email = all.nextLine();
            System.out.println("Enter your password");
            password = all.nextLine();
            if(Main.email.equals(email) && Main.password.equals(password)){
            toast.showToast("\n\n\n\nLogin Successfull!\nWelcome back, "+Main.name+".\nStudent ID: "+Main.st_id+".");
            }
            else{
            Main.login_attempt = Main.login_attempt-1;
            if(!(Main.login_attempt==0)){
              toast.showToast("\n\n\n\n\nIncorrect email or password! You may attempt more "+Main.login_attempt+((Main.login_attempt==1)?" time":" times")+"\nTry again...\n");
            }
            try_again.proceess_login();
            } 
            
        }
        else{
            toast.showToast("\n\n\n\nToo many attempts!\nYour account has been disabled!");
        }
        
    }
    
    
}
