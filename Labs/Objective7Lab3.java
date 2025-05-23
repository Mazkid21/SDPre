public class Objective7Lab3 {
    public static void main(String[] args) {
        int counter = 0; 

        while(counter <= 20) {
            
            if(counter % 2 == 0) {
                System.out.println("The number " + counter + " is even");
            } else {
                System.out.println("The number " + counter + " is odd");
            }
            counter = counter + 1; 
        }
    }
}