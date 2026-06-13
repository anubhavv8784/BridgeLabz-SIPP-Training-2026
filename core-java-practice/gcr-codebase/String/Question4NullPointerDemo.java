public class Question4NullPointerDemo {
    public static void generateNullPointerException() {
        String s = null;
        s.length();
    }

    public static void handleNullPointerException() {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: attempted to call method on null.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException (caught via handler):");
        handleNullPointerException();
    }
}
