import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < input; i++) {
            int num = scanner.nextInt();
            if (num == 5) {
                gradeA += 1;
            } else if (num == 4) {
                gradeB += 1;
            } else if (num == 3) {
                gradeC += 1;
            } else if (num == 2) {
                gradeD += 1;
            }
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}