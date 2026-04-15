import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        System.out.println("Fibonacci Series : ");
        System.out.print(n1 + " , " + n2);

        for (int i = 2; i < num; i++) {
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
            System.out.print(" , " + next);
        }
    }
}