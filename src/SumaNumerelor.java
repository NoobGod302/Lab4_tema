import java.util.Scanner;

public class SumaNumerelor {

    public static int calculeazaSuma(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar intreg: ");
        int input = scanner.nextInt();

        System.out.println("Nr introdus: " + input);
        System.out.println("suma este " + calculeazaSuma(input));
    }
}
