import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = generateUnique6DigitOtps(10);
        System.out.print("Generated OTPs: ");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();
        System.out.println("All OTPs are unique: " + allUnique(otps));
    }

    public static int[] generateUnique6DigitOtps(int count) {
        int[] otps = new int[count];
        Set<Integer> unique = new HashSet<>();
        int index = 0;
        while (index < count) {
            int otp = (int) (Math.random() * 900000) + 100000;
            if (!unique.contains(otp)) {
                unique.add(otp);
                otps[index++] = otp;
            }
        }
        return otps;
    }

    public static boolean allUnique(int[] numbers) {
        Set<Integer> seen = new HashSet<>();
        for (int number : numbers) {
            if (seen.contains(number)) {
                return false;
            }
            seen.add(number);
        }
        return true;
    }
}
