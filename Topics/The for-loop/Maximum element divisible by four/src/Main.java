import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < input; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}