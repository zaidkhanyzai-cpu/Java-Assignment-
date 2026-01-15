import java.util.Scanner;

class DiscountPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter original selling price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        double discountAmount = (originalPrice * discount) / 100;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Discounted selling price = " + finalPrice);
    }
}