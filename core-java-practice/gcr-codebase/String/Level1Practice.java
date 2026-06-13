import java.util.Scanner;

public class Level1Practice {
    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static String createSubstringCharAt(String s, int start, int end) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static char[] getCharacters(String s) {
        if (s == null) return new char[0];
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    public static void generateNullPointerException() {
        String s = null;
        s.length(); // will throw NullPointerException
    }

    public static void handleNullPointerException() {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: variable was null.");
        }
    }

    public static void generateStringIndexOutOfBoundsException(String s) {
        // access index equal to length to force exception
        System.out.println(s.charAt(s.length()));
    }

    public static void handleStringIndexOutOfBoundsException(String s) {
        try {
            generateStringIndexOutOfBoundsException(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: index out of range.");
        }
    }

    public static String generateIllegalArgumentException(String s, int start, int end) {
        if (start > end) throw new IllegalArgumentException("start index greater than end index");
        return s.substring(start, end);
    }

    public static void handleIllegalArgumentException(String s, int start, int end) {
        try {
            generateIllegalArgumentException(s, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        }
    }

    public static int generateNumberFormatException(String s) {
        return Integer.parseInt(s);
    }

    public static void handleNumberFormatException(String s) {
        try {
            generateNumberFormatException(s);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: input is not a valid integer.");
        }
    }

    public static void generateArrayIndexOutOfBoundsException(int[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handleArrayIndexOutOfBoundsException(int[] arr) {
        try {
            generateArrayIndexOutOfBoundsException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: index out of range.");
        }
    }

    public static String convertToUpperCaseAscii(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') sb.append((char) (c - 32));
            else sb.append(c);
        }
        return sb.toString();
    }

    public static String convertToLowerCaseAscii(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') sb.append((char) (c + 32));
            else sb.append(c);
        }
        return sb.toString();
    }

    // helpers
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void printCharArray(char[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect question (1-10) or 0 to exit:");
            System.out.println("1 Compare two strings using charAt");
            System.out.println("2 Create substring using charAt");
            System.out.println("3 Convert string to char array without toCharArray");
            System.out.println("4 Demonstrate NullPointerException");
            System.out.println("5 Demonstrate StringIndexOutOfBoundsException");
            System.out.println("6 Demonstrate IllegalArgumentException");
            System.out.println("7 Demonstrate NumberFormatException");
            System.out.println("8 Demonstrate ArrayIndexOutOfBoundsException");
            System.out.println("9 Convert text to UPPERCASE without toUpperCase");
            System.out.println("10 Convert text to lowercase without toLowerCase");
            System.out.print("Choice: ");
            int choice = -1;
            try { choice = Integer.parseInt(sc.next()); } catch (Exception e) { System.out.println("Invalid choice"); continue; }
            sc.nextLine();
            if (choice == 0) break;
            switch (choice) {
                case 1: {
                    System.out.print("Enter first string (no spaces): ");
                    String a = sc.next();
                    System.out.print("Enter second string (no spaces): ");
                    String b = sc.next();
                    boolean byCharAt = compareUsingCharAt(a, b);
                    boolean byEquals = a.equals(b);
                    System.out.println("compareUsingCharAt: " + byCharAt);
                    System.out.println("equals(): " + byEquals);
                    System.out.println("Results match: " + (byCharAt == byEquals));
                    break;
                }
                case 2: {
                    System.out.print("Enter string: ");
                    String s = sc.nextLine();
                    System.out.print("Enter start index (int): ");
                    int start = Integer.parseInt(sc.next());
                    System.out.print("Enter end index (int): ");
                    int end = Integer.parseInt(sc.next());
                    sc.nextLine();
                    String sub1 = createSubstringCharAt(s, start, end);
                    String sub2 = s.substring(Math.max(0, start), Math.min(s.length(), end));
                    System.out.println("createSubstring(): " + sub1);
                    System.out.println("substring(): " + sub2);
                    System.out.println("Match: " + sub1.equals(sub2));
                    break;
                }
                case 3: {
                    System.out.print("Enter string: ");
                    String s = sc.nextLine();
                    char[] a = getCharacters(s);
                    char[] b = s.toCharArray();
                    System.out.print("getCharacters(): "); printCharArray(a);
                    System.out.print("toCharArray(): "); printCharArray(b);
                    System.out.println("Match: " + compareCharArrays(a, b));
                    break;
                }
                case 4: {
                    System.out.println("Calling method that generates NullPointerException and handler...");
                    System.out.println("Directly generating (will crash if uncaught):");
                    try { generateNullPointerException(); } catch (NullPointerException e) { System.out.println("Caught NPE when generated directly."); }
                    System.out.println("Now handled version:");
                    handleNullPointerException();
                    break;
                }
                case 5: {
                    System.out.print("Enter string: ");
                    String s = sc.nextLine();
                    System.out.println("Generating StringIndexOutOfBoundsException (uncaught):");
                    try { generateStringIndexOutOfBoundsException(s); } catch (Exception e) { System.out.println("Caught: " + e.getClass().getSimpleName()); }
                    System.out.println("Handled version:");
                    handleStringIndexOutOfBoundsException(s);
                    break;
                }
                case 6: {
                    System.out.print("Enter string: ");
                    String s = sc.nextLine();
                    System.out.print("Enter start index: ");
                    int st = Integer.parseInt(sc.next());
                    System.out.print("Enter end index: ");
                    int en = Integer.parseInt(sc.next());
                    sc.nextLine();
                    System.out.println("Generating IllegalArgumentException if start > end:");
                    try { generateIllegalArgumentException(s, st, en); System.out.println("No exception thrown."); } catch (Exception e) { System.out.println("Caught: " + e.getClass().getSimpleName()); }
                    System.out.println("Handled version:");
                    handleIllegalArgumentException(s, st, en);
                    break;
                }
                case 7: {
                    System.out.print("Enter a string to parse as integer: ");
                    String s = sc.nextLine();
                    System.out.println("Generating NumberFormatException (uncaught):");
                    try { System.out.println(generateNumberFormatException(s)); } catch (Exception e) { System.out.println("Caught: " + e.getClass().getSimpleName()); }
                    System.out.println("Handled version:");
                    handleNumberFormatException(s);
                    break;
                }
                case 8: {
                    System.out.print("Enter number of elements: ");
                    int n = Integer.parseInt(sc.next());
                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " integers:");
                    for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(sc.next());
                    sc.nextLine();
                    System.out.println("Generating ArrayIndexOutOfBoundsException (uncaught):");
                    try { generateArrayIndexOutOfBoundsException(arr); } catch (Exception e) { System.out.println("Caught: " + e.getClass().getSimpleName()); }
                    System.out.println("Handled version:");
                    handleArrayIndexOutOfBoundsException(arr);
                    break;
                }
                case 9: {
                    System.out.print("Enter a line of text: ");
                    String s = sc.nextLine();
                    String converted = convertToUpperCaseAscii(s);
                    System.out.println("ASCII converted: " + converted);
                    System.out.println("toUpperCase(): " + s.toUpperCase());
                    System.out.println("Match: " + converted.equals(s.toUpperCase()));
                    break;
                }
                case 10: {
                    System.out.print("Enter a line of text: ");
                    String s = sc.nextLine();
                    String converted = convertToLowerCaseAscii(s);
                    System.out.println("ASCII converted: " + converted);
                    System.out.println("toLowerCase(): " + s.toLowerCase());
                    System.out.println("Match: " + converted.equals(s.toLowerCase()));
                    break;
                }
                default: System.out.println("Invalid selection");
            }
        }
        sc.close();
        System.out.println("Goodbye");
    }
}
