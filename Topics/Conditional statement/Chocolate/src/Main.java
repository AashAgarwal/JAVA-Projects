import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthN = scanner.nextInt();
        int widthM = scanner.nextInt();
        int segmentK = scanner.nextInt();
        if (segmentK > lengthN * widthM) {
            System.out.println("NO");
        } else if (segmentK % lengthN == 0 || segmentK % widthM == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}