class MobilePhone {
    private String brand;
    private String model;
    private double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone =
                new MobilePhone("Samsung", "S24", 75000);

        phone.displayDetails();
    }
}