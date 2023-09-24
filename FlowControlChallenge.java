//i am importing my scanner class
import java.util.Scanner;
public class FlowControlChallenge {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //1. input two numbers
    //the code below prompts the user to enter two integers and stores them in
    //num1 and num2
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

    //2. calculate the difference
    // line calculates the absolute difference between num1 and num2
    // stores it in the variable called difference
        int difference = Math.abs(num1 - num2);
    //3. if the program is less than 200 then the program ends
        if (difference < 200) {
            System.out.println("No output. Program ends. ");
        }

    scanner.close();

    }
}
