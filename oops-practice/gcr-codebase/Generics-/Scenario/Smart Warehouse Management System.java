import java.util.*;

abstract class WarehouseItem {
    abstract void display();
}

class Electronics extends WarehouseItem {
    public void display() {
        System.out.println("Electronics Item");
    }
}

class Grocery extends WarehouseItem {
    public void display() {
        System.out.println("Grocery Item");
    }
}

class Furniture extends WarehouseItem {
    public void display() {
        System.out.println("Furniture Item");
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

public class WarehouseDemo {

    static void show(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list)
            item.display();
    }

    public static void main(String[] args) {

        Storage<Electronics> s = new Storage<>();

        s.addItem(new Electronics());

        show(s.getItems());
    }
}