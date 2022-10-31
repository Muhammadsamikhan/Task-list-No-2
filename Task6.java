import java.util.*;
public class Task6 {
 
 public static void main(String[] args) {
 
int choice;
String order;
System.out.println("Menu");
System.out.println("1. Tea");
System.out.println("2. Coffe");
System.out.println("3. Cold Drink");

System.out.println("Enter choice (1-3)");
Scanner ob = new Scanner(System.in);
choice=ob.nextInt();

switch(choice)
{
case 1:
	order=" Price of TEA is 40.Rs";
    break;
case 2:
	order=" Price of Coffe is 100.Rs";
   break;
case 3:
	order=" Price of Cold Drink is 80.Rs";
    break;
    
    default :
    order="not in menu";
}
	System.out.println(order);
 
 }
 
}
