import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double result = num1 * 10.5 + num2 * 4.4 + (num3 + num4) / 2.2;
        System.out.println(result);
    }
}