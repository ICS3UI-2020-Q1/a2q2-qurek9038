import java.util.Scanner;
/**
 *This program determines which of the two integers the user inputs is the largest
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user for the first integer
    System.out.println("Please enter an integer:");

    //Store user input using a varible
    int first = input.nextInt();

    //Ask the user for the second integer
    System.out.println("Please enter another integer:");

    //Store user input using a second varible 
    int second = input.nextInt(); 

    //Responses that will display based on which number is bigger or if they are equal
    if (first > second){
      System.out.println("The biggest number is " + first + ".");
    }
    if (second > first){
      System.out.println("The biggest number is " + second + ".");
    }
    if (first == second){
      System.out.println("There is no biggest number.");
    }
    
  }
}
