import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many days to seconds?");
        int Days = reader.nextInt();
        int second = 60 * 60 * 24 * Days;

        System.out.println("There are " + second + " seconds in " + Days + " days");

    }
}
