import java.util.Scanner;
/**
 * This program counts the number of odd, even, and zero digits.
 * @author jonathon webster
 * @version September 24, 2017
*/
public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int num;
    int num2;
    int num3;
    int odd = 0;
    int even = 0;
    int zero = 0;
    System.out.println("Please enter a positive integer: ");
    num = scan.nextInt();
      while (num >= 10) {
        num2 = ((int)(num/10))*10;
        num3 = num - num2;
          if (num3==0){
            zero++;
          }
          else{
            if (num3%2 == 0) {
              even++;
            }
            else{
              odd++;
            }
          }
         num = num2/10;
      }
    if (num < 10) {
      if (num == 0)  {
         zero++;
      }
      else {
        if (num%2 == 0) {
          even++;
        }
        else{
          odd++;
        }
      }
    }
    
    if (even == 1){
      System.out.println("There is 1 even digit.");
    }
    else if (even > 1) {
      System.out.println("There are " + even + " even digits.");
    }
    else {
      System.out.println("There are 0 even digits.");
    }  
    
     if (odd == 1){
      System.out.println("There is 1 odd digit.");
    }
    else if (odd > 1) {
      System.out.println("There are " + odd + " odd digits.");
    }
    else {
      System.out.println("There are 0 odd digits.");
    }
    
     if (zero == 1){
      System.out.println("There is 1 zero digit.");
    }
    else if (zero > 1) {
      System.out.println("There are " + zero + " zero digits.");
    }
    else {
      System.out.println("There are 0 zero digits.");
    }
  }
}
