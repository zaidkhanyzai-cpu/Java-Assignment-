import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter voltage: ");
        double volt = input.nextDouble();

        System.out.print("Enter current (ampere): ");
        double ampere = input.nextDouble();

        double watts = volt * ampere;

        System.out.println("Power consumption in watts = " + watts);
    }
}
    

