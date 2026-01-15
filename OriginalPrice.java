import java.util.Scanner;

class OriginalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter discounted selling price: ");
        double discountedPrice = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        double originalPrice = discountedPrice / (1 - discount / 100);

        System.out.println("Original selling price = " + originalPrice);
    }
}
