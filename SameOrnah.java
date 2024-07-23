import java.util.Scanner;

public class SameOrnah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = sc.nextLine();

        System.out.println("Enter another word:");
        String word2=sc.nextLine();

        // If statement
        if (word.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are not the same");
        }
    }
}
