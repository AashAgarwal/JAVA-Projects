import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSleep = scanner.nextInt();
        int maxSleep = scanner.nextInt();
        int annHours = scanner.nextInt();
        if (annHours >= minSleep && annHours <= maxSleep) {
            System.out.println("Normal");
        } else if (annHours < minSleep) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}