class Product<T> {

    T category;
    double price;

    Product(T category, double price) {
        this.category = category;
        this.price = price;
    }

    void display() {
        System.out.println(category + " Price = " + price);
    }
}

class BookCategory {
    public String toString() {
        return "Book";
    }
}

class ClothingCategory {
    public String toString() {
        return "Clothing";
    }
}

public class Marketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }

    public static void main(String[] args) {

        Product<BookCategory> p =
                new Product<>(new BookCategory(), 500);

        applyDiscount(p, 10);

        p.display();
    }
}