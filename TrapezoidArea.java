import java.util.Scanner;

class TrapezoidArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of first parallel side: ");
        double a = input.nextDouble();

        System.out.print("Enter length of second parallel side: ");
        double b = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        double area = h * (a + b) / 2;

        System.out.println("Area of trapezoid = " + area);
    }
}