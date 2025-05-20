import java.util.Scanner; 

public class Objective4Lab2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Create variables
        int num1, num2, num3;
        double dub1, dub2, dub3; 
        // Get 3 int from user 
        System.out.println("Please enter whole number: ");
        num1 = keyboard.nextInt(); 
        System.out.println("Please enter second whole number: ");
        num2 = keyboard.nextInt(); 
        System.out.println("Please enter third whole number: ");
        num3 = keyboard.nextInt();
        // Get 3 decimal "double" numbers from user 
        System.out.println("Please enter decimal number: ");
        dub1 = keyboard.nextDouble(); 
        System.out.println("Please enter second decimal number: "); 
        dub2 = keyboard.nextDouble();
        System.out.println("Please enter third decimal numer: ");
        dub3 = keyboard.nextDouble();
        // Print 3 ints and their sum 
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
        // Print 3 decimals "doubles" and their sum 
        System.out.println(dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));
        
        keyboard.close();
    }
}