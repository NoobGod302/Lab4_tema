import java.util.Scanner;

public class Caractere {

    public static void printMiddleCharacters(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            int mid = length / 2;
            System.out.println(word.substring(mid - 1, mid + 1));
        } else {
            int mid = length / 2;
            System.out.println(word.charAt(mid));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cuvant: ");
        String input = scanner.next();

        System.out.println("Cuvantul introdus este: " + input);
        System.out.print("Caracterele din mijloc sunt: ");
        printMiddleCharacters(input);
    }
}
