import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.startsWith("J") || str.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}