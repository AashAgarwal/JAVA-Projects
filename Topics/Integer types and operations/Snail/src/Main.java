import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int goesUp = scanner.nextInt();
        int goesDown = scanner.nextInt();
        int numberOfDays = ((height - goesUp) / (goesUp - goesDown)) + ((goesUp - goesDown) + (height - goesUp) % (goesUp - goesDown) - 1) / (goesUp - goesDown) + 1;
        System.out.println(numberOfDays);
    }
}