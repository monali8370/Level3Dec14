import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        double l, b, h;

        double volume = calculateVolume();
        System.out.println("Volume of the cuboid: " + volume);
    }
    public static double calculateVolume() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        double l = sc.nextDouble();

        System.out.println("Enter the height:");
        double h = sc.nextDouble();

        System.out.println("Enter the breadth:");
        double b = sc.nextDouble();

        double res = l * b * h;
        sc.close();

        return res;
    }
}
