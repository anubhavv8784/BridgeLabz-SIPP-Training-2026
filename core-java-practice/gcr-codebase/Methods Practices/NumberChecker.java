public class NumberChecker {
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int absValue = Math.abs(number);
        int digitCount = countDigits(absValue);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = absValue % 10;
            absValue /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == Math.abs(number);
    }

    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = getDigits(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = largest;
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = getDigits(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            secondSmallest = smallest;
        }
        return new int[]{smallest, secondSmallest};
    }

    public static int sumOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit * digit;
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        if (number == 0) {
            return false;
        }
        return number % sumOfDigits(number) == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static int[] reverseDigits(int number) {
        int[] digits = getDigits(number);
        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }
        return reverse;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeNumber(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(number);
        return compareArrays(digits, reversed);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = sumOfDigits(square);
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        int product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numberStr = Integer.toString(number);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numberStr);
    }

    public static boolean isBuzzNumber(int number) {
        return number % 10 == 7 || number % 7 == 0;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 1) {
            return true;
        }
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
