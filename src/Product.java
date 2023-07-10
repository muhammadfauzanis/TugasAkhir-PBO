class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + productName + ", Price: Rp." + price);
    }
}
