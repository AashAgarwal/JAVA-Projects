import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean flagged = true;

        while (scanner.hasNext() && flagged) {
            int num = scanner.nextInt();
            if (num == 0) {
                flagged = false;
                break;
            } else {
                if (sum < 1000) {
                    sum += num;
                }
            }
        }
        if (sum < 1000) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}