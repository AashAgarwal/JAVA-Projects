import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                count++;
                if (count <= n) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}