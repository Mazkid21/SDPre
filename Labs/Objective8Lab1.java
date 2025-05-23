public class Objective8Lab1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=0; i<10; i++) {
            count++; 
            System.out.println(count);
        }
        for (int i=0; i<10; i++) {
            System.err.println(count);
            count--;
        }

    }
}