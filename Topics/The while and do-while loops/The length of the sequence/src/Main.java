import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        while (num != 0) {
            count++;
            num = scanner.nextInt();
        }
        System.out.println(count);
    }
}