import java.util.Scanner;

public class Task6 {

    public static void main(String [] args) {

        System.out.println("Enter count meters:");
        Scanner sx = new Scanner(System.in);

        double meters = sx.nextDouble();

        System.out.format("Inches: %s", meters * 39.3700787);
        System.out.println();
        System.out.format("Miles: %s", meters * 0.000621371192);
    }
}
