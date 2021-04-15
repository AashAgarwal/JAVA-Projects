import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double sum = 0;
        sum = Math.PI * radius * radius;
        System.out.println(sum);
    }
}
