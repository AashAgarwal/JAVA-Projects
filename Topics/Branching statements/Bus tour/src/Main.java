import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int[] bridgeArray = new int[numberOfBridges];
        boolean flag = true;
        boolean willNotCrash = true;
        int count = 1;

        for (int i = 0; i < numberOfBridges; i++) {
            bridgeArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfBridges && flag; i++) {
            if (bridgeArray[i] <= heightOfBus) {
                willNotCrash = false;
                flag = false;
                break;
            }
            count++;
        }

        if (willNotCrash) {
            System.out.println("Will not crash");
        } else {
            System.out.printf("Will crash on bridge %d", count);
        }
    }
}