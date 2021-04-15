import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationOfDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int hotelPerNightCost = scanner.nextInt();
        int tripCost = durationOfDays * foodCostPerDay + 2 * oneWayFlightCost + (durationOfDays - 1) * hotelPerNightCost;
        System.out.println(tripCost);
    }
}