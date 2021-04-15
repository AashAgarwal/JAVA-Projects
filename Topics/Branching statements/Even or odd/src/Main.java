import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flagged = false;
        while (scanner.hasNext() && !flagged) {
            int num = scanner.nextInt();
            if (num == 0) {
                flagged = true;
                break;
            } else if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}