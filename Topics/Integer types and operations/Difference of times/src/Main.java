import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int timeInSeconds1 = hour1 * 3600 + minute1 * 60 + seconds1;
        int timeInSeconds2 = hour2 * 3600 + minute2 * 60 + seconds2;

        System.out.println(timeInSeconds2 - timeInSeconds1);
    }
}