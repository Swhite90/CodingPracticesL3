import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        int money = scanner.nextInt();
        if (money <= 12000) {
            System.out.println("Sorry, not enough");}
        else if (money >= 12000)
            System.out.println("You Have Enough!");{

        }
    }
}
