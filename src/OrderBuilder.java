import java.util.*;

class OrderBuilder {
    private String customerName;
    private List<Product> products = new ArrayList<>();
    private String paymentMethod;
    private String shippingAddress;

    public String getCustomerName() {
        return customerName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public OrderBuilder setCustomer(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        return this;
    }

    public OrderBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public OrderBuilder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public Order build() {
        return new Order(customerName, products, paymentMethod, shippingAddress);
    }
}
