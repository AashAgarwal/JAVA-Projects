import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long product = 1;
        int factorialNumberN = 1;

        while (product <= num) {
            product = product * (factorialNumberN + 1);
            factorialNumberN++;
        }
        System.out.println(factorialNumberN);
    }
}