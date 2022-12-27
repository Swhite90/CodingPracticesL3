import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;

        System.out.println("Enter a number to find the factors:");

        int x = in.nextInt();

        System.out.print("\nThe factors of " + x + " are: ");
        while (i <= x) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
            ++i;
        }
        System.out.print("\n");
    }
}
