import java.util.Random;

public class HeightsAnalysis {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        System.out.print("Generated heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = calculateMeanHeight(heights);

        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
    }

    public static int[] generateRandomHeights(int count, int min, int max) {
        int[] heights = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static double calculateMeanHeight(int[] heights) {
        double sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum / heights.length;
    }
}
