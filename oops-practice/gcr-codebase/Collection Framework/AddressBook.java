import java.util.*;

public class AddressBook {
    private ArrayList<Contact> contacts;
    private HashMap<String, Contact> nameIndex;
    private HashSet<String> phoneNumbers;

    static class Contact implements Comparable<Contact> {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public int compareTo(Contact other) {
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
        }
    }

    public AddressBook() {
        contacts = new ArrayList<>();
        nameIndex = new HashMap<>();
        phoneNumbers = new HashSet<>();
    }

    public void addContact(String name, String phone, String email) {
        if (phoneNumbers.contains(phone)) {
            System.out.println("Error: Phone number " + phone + " already exists!");
            return;
        }

        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        nameIndex.put(name, contact);
        phoneNumbers.add(phone);
        System.out.println("Contact added: " + contact);
    }

    public Contact searchByName(String name) {
        if (nameIndex.containsKey(name)) {
            System.out.println("Contact found: " + nameIndex.get(name));
            return nameIndex.get(name);
        } else {
            System.out.println("Contact with name '" + name + "' not found!");
            return null;
        }
    }

    public void deleteContact(String name) {
        if (nameIndex.containsKey(name)) {
            Contact contact = nameIndex.get(name);
            contacts.remove(contact);
            nameIndex.remove(name);
            phoneNumbers.remove(contact.phone);
            System.out.println("Contact deleted: " + contact);
        } else {
            System.out.println("Contact with name '" + name + "' not found!");
        }
    }

    public void displaySorted() {
        Collections.sort(contacts);
        System.out.println("\n=== Address Book (Sorted by Name) ===");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        System.out.println("=== Adding Contacts ===");
        book.addContact("Alice Johnson", "9876543210", "alice@gmail.com");
        book.addContact("Bob Smith", "9876543211", "bob@gmail.com");
        book.addContact("Charlie Brown", "9876543212", "charlie@gmail.com");
        book.addContact("Diana Prince", "9876543213", "diana@gmail.com");

        System.out.println("\n=== Attempting Duplicate Phone ===");
        book.addContact("Eve Wilson", "9876543210", "eve@gmail.com");

        System.out.println("\n=== Searching Contact ===");
        book.searchByName("Alice Johnson");

        System.out.println("\n=== Deleting Contact ===");
        book.deleteContact("Bob Smith");

        book.displaySorted();
    }
}
