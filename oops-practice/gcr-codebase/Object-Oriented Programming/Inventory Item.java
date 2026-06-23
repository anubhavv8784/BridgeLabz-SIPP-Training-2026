class Item {
    private int itemCode;
    private String itemName;
    private double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(itemCode + " " + itemName + " " + price);
    }

    double totalCost(int quantity) {
        return quantity * price;
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Laptop", 50000);

        i.displayDetails();
        System.out.println("Total Cost = " + i.totalCost(2));
    }
}