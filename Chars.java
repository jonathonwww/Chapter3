import java.util.Scanner;
/**
 * The purpose of this program is to ask the user to ask the user for a string of 
 * characters and print out each individual character per line.
 * 
 * @author Jonathon Webster
 * @version September 22, 2017
 */
 
 public class Main {
   
   public static void main(String[] args) {
     
     String chars;
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter a string of characters: ");
     chars = scan.nextLine();
     int length = chars.length();
     for (int num = 0; num < length; num++)
      System.out.println(chars.substring(num, num + 1));
   }
 }
