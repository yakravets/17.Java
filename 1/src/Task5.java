import java.util.Scanner;

public class Task5 {
    public static void main(String [] args) {

        System.out.println("Enter number month:");
        Scanner n = new Scanner(System.in);
        int s = n.nextInt();

        switch (s)
        {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid number month!");
                break;
        }
    }
}
