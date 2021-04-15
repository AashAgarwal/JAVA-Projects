import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int leftInterval = scanner.nextInt();
        int rightInterval = scanner.nextInt();
        int sum = 0;
        int counter = 0;

        for (int i = leftInterval; i <= rightInterval; i++) {
            if (i % 3 == 0) {
                counter += 1;
                sum += i;
            }
        }
        System.out.println((double) sum / counter);
    }
}