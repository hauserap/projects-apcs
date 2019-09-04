import java.util.Scanner;

public class SignUp{

    public static void main(String[] args){
        

        Scanner scanUsername = new Scanner (System.in);
        System.out.println("Submit a username");

        String inUserData = scanUsername.nextLine();

        String takenUsername = "admin";
        String takenUsername1 = "jimbob234";
        String takenUsername2 = "skater_gurl17";
        String takenUsername3 ="gary";


        if(inUserData.equals(takenUsername)){
            System.out.println("User name is taken");
        }else if(inUserData.equals(takenUsername1)){
            System.out.println("User name is taken");
        }else if(inUserData.equals(takenUsername2)){
            System.out.println("User name is taken");
        }else if(inUserData.equals(takenUsername3)){
            System.out.println("User name is taken");
        }else{
            System.out.println("Sounds good");
        }
    
            
        


    


         
    }
}