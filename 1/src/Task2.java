import java.util.Scanner;

public class Task2 {
    public static void main(String [] args) {

        System.out.println("Enter number:");
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();

        System.out.println("Enter percent:");
        Scanner p = new Scanner(System.in);
        int k = p.nextInt();

        System.out.format("%s in %s = %s", s, k, s / 100.0 * k);
    }
}
