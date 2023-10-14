import java.util.Random;
import java.util.Scanner;

public class Homework5_13_10_2023 {
    public static void main(String[] args) {
        //task 1
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //enter the first number
        int m = scanner.nextInt(); //enter the second number
        int matchedNumber = 10; //initialize the number
        //calculate the first difference
        int differenceN = Math.abs(n - 10);
        //calculate the second difference
        int differenceM = Math.abs(m - 10);
        //check with the ternary operator which number is close to -> matchedNumber
        int сhecking = n < m ? n : m; //enter the rules for ternary operator
        System.out.println("Closest to 10 is " + сhecking); //print in the console

        //task 2
        Random rnd = new Random(); //create object Random
        Scanner scanner1 = new Scanner(System.in); //create object Scanner
        int number1 = rnd.nextInt(10); //initialize the rand number1
        int number2 = rnd.nextInt(10); //initialize the rand number2
        //multiply number1 and number2
        int multiplication = number1 * number2;
        System.out.printf("How much will be -> %d multiply by -> %d, enter your value: %n", number1, number2); // print the question for user
        int userValue = scanner1.nextInt(); //initialize the scanner for user answer
        //create the rule for if else
        if (userValue == multiplication) {
            System.out.printf("You answered correctly -> %d%n", userValue); //print correct answer
        } else {
            System.out.printf("That's wrong, the correct answer is -> %d%n", multiplication); //print wrong answer to correct
        }

        //task3
        Scanner scanner2 = new Scanner(System.in); // create an object for user input
        System.out.println("Enter the year: "); //print the rule for user
        int userInput = scanner2.nextInt(); //initialize user answer of year
        //create a ternary operator for check year
        String elvisYearsOfLife = (userInput < 1935) ? "Elvis not born yet" :
                (userInput <= 1977) ? "Elvis Life" : "Elvis always in our heart!";
        System.out.println(elvisYearsOfLife); //print rule
    }
}
