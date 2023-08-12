// Task 1 -> Number Guess Game 
import java.util.Scanner;
import java.util.Random;
 public class PROJECT1
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Welcome To number Guess Game");

         boolean playagain;
         do{
          Random rand = new Random();
          int randomnumber = rand.nextInt(100) + 1;
         while(true){
         System.out.println("Enter the number for Guess(0-100)");
         int x = sc.nextInt();
           if(x==randomnumber)
           {
            System.out.println("You Guess corret Number");
            break;
          }
          else if(x>randomnumber)
          {
            System.out.println("The number "+x+" is too high");
          } 
          else if (x<randomnumber)
          {
            System.out.println("The number "+x+" is too low");
          }

          }
          System.out.println("Do You Want To Play again ? (yes/no)");  
          playagain=sc.next().equalsIgnoreCase("yes");
      }
       while(playagain);
           System.out.println("Thank You For Playing Number Guess Game");
    }

 }