import java.io.*;

public class Operations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Let's do the mathematical operations");

        System.out.print("Enter the first number: ");
        String line1 = reader.readLine();
        int num1 = Integer.parseInt(line1);

        System.out.print("Enter the second number: ");
        String line2 = reader.readLine();
        int num2 = Integer.parseInt(line2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        System.out.println("Difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
        
        if (num2 != 0) {
            // In 1.3, we can still use double for division
            System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / (double)num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}