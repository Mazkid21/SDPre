import java.util.Scanner; 

public class Objective4Lab1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        //  Begin user inputs 
        System.out.println("Enter your first name: "); 
        String userFName = keyboard.nextLine(); 
        System.out.println("Now enter you last name: ");
        String userLastName = keyboard.nextLine();
        System.out.println("What is your favorite animal?");
        String userFavAnimal = keyboard.nextLine();
        System.out.println("What is your favorite food?"); 
        String userFavFood = keyboard.nextLine();
        System.out.println("What is your favorite song?");
        String userFavSong = keyboard.nextLine(); 
        //Begin output 
        System.out.println("My name is " + userFName + " " + userLastName + ".\n" + "My favorite animal is " + userFavAnimal + ".\n" +
        "My favorite food is " + userFavFood + ".\n" +
        "My favorite song is " + userFavSong + ".");

        keyboard.close();
    }
}