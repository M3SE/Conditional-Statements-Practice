import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter another number: ");
        int b = Integer.parseInt(sc.nextLine());
            if (a == b) {
                System.out.println("The numbers are the same");
            } else if (a > b) {
                System.out.println("The first number is larger than the second");
            } else {
                System.out.println("The second number is larger than the first");
            }
    }
}
