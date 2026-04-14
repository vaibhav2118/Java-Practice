import java.io.*;

public class Reverse {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int number = Integer.parseInt(br.readLine().trim());
        System.out.print("Reverse of " + number + " is ");

        String s = "";
        while (number != 0) {
            int pick_last = number % 10;

            s = s + Integer.toString(pick_last);
            number = number / 10;
        }

        System.out.println(s);
    }

}