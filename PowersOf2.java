import java.util.Scanner;
/**
 * this program calculates the different powers of powers of 2
 * @author Jonathon Webster
 * @version September 24, 2017
 */
public class Main {
  
  public static void main(String[] args) {
    
    int numPowersOf2; //How many powers of 2 to compute
    int nextPowerOf2 = 1; //Current power of 2
    int exponent=1; //Exponent for current power of 2 -- this
    //also serves as a counter for the loop
    Scanner scan = new Scanner(System.in);
    System.out.println("How many powers of 2 would you like printed?");
    numPowersOf2 = scan.nextInt();
    //print a message saying how many powers of 2 will be printed
    System.out.println("Here are the first " + numPowersOf2 + " powers of 2:");
    //initialize exponent -- the first thing printed is 2 to the what?
    System.out.println("2^0 = 1");
    while (exponent <= numPowersOf2 ) {
      System.out.println("2^" + exponent + " = " + (2 * nextPowerOf2));
      nextPowerOf2 *= 2;
      exponent++;
//print out current power of 2
//find next power of 2 -- how do you get this from the last one?
//increment exponent
    }
  }
}
