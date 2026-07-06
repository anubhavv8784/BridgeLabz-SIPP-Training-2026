import java.util.*;

class Main {

    static void print(List<?> list) {

        for (Object obj : list) {
            System.out.print(obj + " ");
        }
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");

        print(nums);
        System.out.println();

        print(names);
    }
}