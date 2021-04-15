import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundredthPlace = number / 100;
        int tenthPlace = (number % 100) / 10;
        int onesPlace = (number % 100) % 10;
        System.out.println(hundredthPlace + tenthPlace + onesPlace);
    }
}