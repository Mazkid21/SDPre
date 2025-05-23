public class Objective7Lab4 {
    public static void main(String[] args){
        int counter, sum;

        counter = 0;
        sum = 0;

            while(counter <= 20 ) {
                sum = counter + sum;
                if(sum == 210) {
                    System.out.println(sum);
                } else {
                    counter = counter + 1;
                }
            }
    }
}