import java.util.Scanner;

public class Task7 {
    public static void main(String [] args) {

        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner((System.in));

        int k = sc.nextInt();
        int l = sc.nextInt();

        if (k<l){
            for (int i = k; i<=l; i++){
                if(i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }
        else {
            for (int i = l; i<=k; i++){
                if(i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
