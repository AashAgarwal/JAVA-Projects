import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int deskForGroup1;
        int deskForGroup2;
        int deskForGroup3;
        if (group1 % 2 == 0) {
            deskForGroup1 = group1 / 2;
        } else {
            deskForGroup1 = group1 / 2 + 1;
        }
        if (group2 % 2 == 0) {
            deskForGroup2 = group2 / 2;
        } else {
            deskForGroup2 = group2 / 2 + 1;
        }
        if (group3 % 2 == 0) {
            deskForGroup3 = group3 / 2;
        } else {
            deskForGroup3 = group3 / 2 + 1;
        }
        System.out.println(deskForGroup1 + deskForGroup2 + deskForGroup3);
    }
}