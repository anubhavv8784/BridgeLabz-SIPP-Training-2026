class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    CartItem(String itemName,
             double price,
             int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity -= qty;
    }

    void displayTotalCost() {
        System.out.println("Total Cost = "
                + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c =
                new CartItem("Mouse", 500, 2);

        c.addItem(3);
        c.removeItem(1);
        c.displayTotalCost();
    }
}