/*
  The following code creates five random OrderIDs to test the fraud detection process.OrderIDs
  consist of a letter from A to E, and a three digit number. Ex. A123.
*/

import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i = 0; i < orderIDs.length; i++) {
            // Generate a random uppercase letter between A (65) and E (69)
            char prefix = (char)(random.nextInt(5) + 'A');

            // Generate a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999) + 1;
            String suffix = String.format("%03d", number);

            // Combine prefix and suffix to form the OrderID
            orderIDs[i] = prefix + suffix;
        }

        // Print all generated OrderIDs
        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}