import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        OrderBuilder builder = new OrderBuilder();

        System.out.print("Enter your name: ");
        String customerName = userInput.nextLine();
        builder.setCustomer(customerName);

        System.out.println("Enter product details (type 'done' to finish)");
        while (true) {
            System.out.print("Product Name: ");
            String productName = userInput.nextLine();
            if (productName.equals("done")) {
                break;
            }

            System.out.print("Product Price: ");
            double productPrice = userInput.nextDouble();
            userInput.nextLine();

            builder.addProduct(productName, productPrice);
        }
        System.out.print("Enter payment method: ");
        String paymentMethod = userInput.nextLine();
        builder.setPaymentMethod(paymentMethod);

        System.out.print("Enter shipping address: ");
        String shippingAddress = userInput.nextLine();
        builder.setShippingAddress(shippingAddress);

        Order order = builder.build();
        System.out.println("-----------------------------------------");
        System.out.println("Order Data");
        order.display();
    }
}
