import java.util.*;
public class Task5 {
 
    public static void main(String[] args) {
         
        //Assuming that there are already 5 registered users
        String[][] userDetails = {
                                    {"user1@example.com", "pass1"}, 
                                    {"user2@example.com", "pass2"},
                                    {"user3@example.com", "pass3"},
                                    {"user4@example.com", "pass4"},
                                    {"user5@example.com", "pass5"}
                                 };
         
        System.out.print("Enter your email id: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
         
        System.out.print("Enter your password: ");
        String password = scanner.next();
         
        boolean isUserFound = false;
         
        for(int i=0; i<userDetails.length; i++){
            //Compare email and password entered by user with the details stored in the array
            if(userDetails[i][0].equals(email) && userDetails[i][1].equals(password)){
                isUserFound = true;
                break;
            }            
        }
         
        if(isUserFound){
            System.out.println("Welcome "+email);
        }else{
            System.out.println("Sorry, you are not a registered user!");
        }
         
        scanner.close();
         
    }
 
}