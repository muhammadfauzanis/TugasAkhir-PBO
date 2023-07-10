import java.util.*;

class Order {
    private String customerName;
    private List<Product> products;
    private String paymentMethod;
    private String shippingAddress;

    public Order(String customerName, List<Product> products, String paymentMethod, String shippingAddress) {
        this.customerName = customerName;
        this.products = products;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        for (Product product : products) {
            product.display();
        }
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Shipping Address: " + shippingAddress);
    }
}
