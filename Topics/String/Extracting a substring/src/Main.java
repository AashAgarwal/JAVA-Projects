import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        System.out.println(str.substring(index1, index2 + 1));
    }
}