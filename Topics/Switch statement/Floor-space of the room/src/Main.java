import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        switch (str) {
            case "rectangle":
                double length = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println(length * height);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double perimeter = (a + b + c) / 2;
                double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
                System.out.println(area);
                break;
            default:
                System.out.println("Enter correct shape");
                break;
        }
    }
}