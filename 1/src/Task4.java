import java.util.Scanner;

public class Task4 {
    public static void main(String [] args) {
        int MIN_NUMBER = 100000;
        int MAX_NUMBER = 999999;

        System.out.println("Enter number that have 6 digit:");
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();

        if(s >= MIN_NUMBER && s <=  MAX_NUMBER)
        {

            char[] digits = Integer.toString(s).toCharArray();

            char tmp;
            tmp = digits[0];
            digits[0] = digits[5];
            digits[5] = tmp;

            tmp = digits[4];
            digits[4] = digits[1];
            digits[1] = tmp;

            System.out.println(digits);
        }
        else
        {
            System.out.println("Your number is not valid.");
        }
    }
}
