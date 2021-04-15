import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double result = input * input * input + input * input + input +1;
        System.out.println(result);
    }
}