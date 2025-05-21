import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
        //Make scanner varible for Scanner 
        Scanner scanner = new Scanner(System.in);
        // Make userNum variable as intiger 
        int userNum;
        // Prompt user to enter number 
        System.out.println("Please enter a number: ");
        //Scan for user input and assign to userNum 
        userNum = scanner.nextInt(); 
        // Even number /2 no remainder - odd numbers /2 remainder of 1 
        // - / operator devides - % devides and returns remainder 
        // if else to determine if number is even or odd
        if(userNum % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }


    }
}