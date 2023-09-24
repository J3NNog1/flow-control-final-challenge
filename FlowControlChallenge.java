//i am importing my scanner class
import java.util.Scanner;
public class FlowControlChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //below I am declaring var. num1 & num 2 are integer variables
        //evenDivBy4Sum/8/notEvenNotDivBy5Sum are integer vars to store the sum of differ types of numbers
        int num1, num2;
        int evenDivBy4Sum = 0;
        int evenDivBy8Sum = 0;
        int notEvenNotDivBy5Sum = 0;

        //while loop that continues until the user inputs two numbers with an absolute difference of at least 200.
        while (true) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
            //The Math.abs(num1 - num2) >= 200 condition checks if the absolute difference between num1 and num2 is greater than or equal to 200.
            if (Math.abs(num1 - num2) >= 200) {
                break; // Exit the loop if the difference is at least 200
            } else { //If the condition is met, the loop is exited using the break statement. If not, it informs the user that the difference must be at least 200 and continues to prompt for input.
                System.out.println("The difference must be at least 200. Try again.");
            }
            //This for loop iterates through numbers starting from the smaller of num1 and num2 up to the larger one (inclusive).
            for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                //Inside the loop, there is a switch statement that checks if the current number i is even or odd using i % 2.
                switch (i % 2) {
                    case 0: // Even numbers
                        if (i % 4 == 0) {
                            evenDivBy4Sum += i;
                        }
                        if (i % 8 == 0) {
                            evenDivBy8Sum += i;
                        }
                        break;
                    default: // Odd numbers
                        //Depending on whether the number is even or odd, it checks if it's divisible by 4 or 8 (for even numbers) or not divisible by 5 (for odd numbers), and updates the respective sum variables.
                        if (i % 5 != 0) {
                            notEvenNotDivBy5Sum += i;
                        }
                        break;
                }


            }


        }

    }
}