import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numberOfInput; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}