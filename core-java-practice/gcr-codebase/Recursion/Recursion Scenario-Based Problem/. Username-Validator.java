class UsernameValidator {

    public static boolean isValid(String str, int index) {

        if (index == str.length()) {
            return true;
        }

        char ch = str.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(str, index + 1);
    }

    public static void main(String[] args) {

        System.out.println(isValid("abcdxyz", 0));
        System.out.println(isValid("abcD123", 0));
    }
}