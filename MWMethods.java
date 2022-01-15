import java.util.Scanner;
import java.lang.Math; 
      public class MWMethods {
      
      public static void main(String[] args) {

      // Creating Scanner Object to input numbers

         Scanner input = new Scanner(System.in);
         double a = 0;
         double b = 0;
         double c = 0;
         double d = 0;
         double e = 0;
         System.out.println("Please enter a number: ");
          a = input.nextDouble();
         System.out.println("Please enter a number: ");
          b = input.nextDouble();
         System.out.println("Please enter a number: ");
          c = input.nextDouble();
         System.out.println("Please enter a number: ");
          d = input.nextDouble();
         System.out.println("Please enter a number: ");
          e = input.nextDouble();
          System.out.println("You entered: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
          System.out.print("The average of these numbers is: ");
          System.out.print(addFive(a, b, c, d, e));
          System.out.println(" ");
          System.out.print("The standard deviation of these numbers is: ");
          System.out.print(SD(a, b, c, d, e));
                       
                  
     }
      public static double addFive(double aa, double bb, double cc, double dd, double ee)
            {
             return (aa + bb + cc + dd + ee) / 5;
            }
      public static double SD(double aa, double bb, double cc, double dd, double ee)
            {
             return Math.sqrt((aa-((aa + bb + cc + dd + ee / 5)))*(aa-((aa + bb + cc + dd + ee / 5))) + ((bb-((aa + bb + cc + dd + ee / 5)))*(bb-((aa + bb + cc + dd + ee / 5)))) + ((cc-((aa + bb + cc + dd + ee / 5)))*(cc-((aa + bb + cc + dd + ee / 5)))) + ((dd-((aa + bb + cc + dd + ee / 5)))*(dd-((aa + bb + cc + dd + ee / 5)))+((ee-((aa + bb + cc + dd + ee / 5)))*(ee-((aa + bb + cc + dd + ee / 5)))/5)));
            }


   }


                 



