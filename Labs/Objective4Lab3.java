import java.util.Scanner;

public class Objective4Lab3 {
    public static void main(String[] args) {
        // Create int variables 
        int birthYear, age, currentYear; 
        // Create Scanner 
        Scanner input = new Scanner(System.in);
        // Create user input for age
        System.out.println("How old are you?");
        age = input.nextInt();
        // Do math to find birth year 
        currentYear = 2025;
        birthYear = currentYear - age;
        // Display output 
        System.out.println("You were born in " + birthYear);
        // Close Scanner 
        input.close();
    }
}