import java.util.Scanner;

public class CountryPopulation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What is the population?");
        int population = read.nextInt();
        System.out.println("What is the area?");
        int area = read.nextInt();

        if (population < 10000 && area < 10000)  {
            System.out.println("Medium City");
        } else if (population > 10000 && area > 10000) {
            System.out.println("Big city.");
        } else if (population > 10000 && area < 10000) {
            System.out.println("Crowded city");
        } else if (population < 10000 && area > 10000) {
            System.out.println("Sparse city");

        }
    }
}
