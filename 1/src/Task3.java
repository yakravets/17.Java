import java.util.Scanner;

public class Task3 {
    public static void main(String [] args) {
        System.out.println("Enter number 1:");
        Scanner sv1 = new Scanner(System.in);
        int s1 = sv1.nextInt();

        System.out.println("Enter number 2:");
        Scanner sv2 = new Scanner(System.in);
        int s2 = sv2.nextInt();

        System.out.println("Enter number 3:");
        Scanner sv3 = new Scanner(System.in);
        int s3 = sv3.nextInt();

        System.out.format("Result concat: %s", s1*100 + s2*10+s3);
    }
}
