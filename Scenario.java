import java.util.Random;

public class Scenario {
    public static void main(String[] args) {
        Random rand = new Random();
        int price = rand.nextInt(50) + 1; // Generates a number between 1 and 50

        System.out.println("Price: " + price);

        if (price < 25) {
            System.out.println("I'll buy!");
        } else {
            System.out.println("Too expensive");
        }
    }
}