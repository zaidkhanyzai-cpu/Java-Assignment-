import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        double area = 3.14 * r * r;
        double circumference = 2 * 3.14 * r;

        System.out.println("Area of circle = " + area);
        System.out.println("Circumference of circle = " + circumference);
    }
}