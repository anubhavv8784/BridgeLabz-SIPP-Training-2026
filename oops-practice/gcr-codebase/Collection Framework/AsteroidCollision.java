import java.util.*;

public class AsteroidCollision {
    /**
     * LeetCode Problem 735: Asteroid Collision
     * We are given an array asteroids of integers representing asteroids in a row.
     * For each asteroid, the absolute value represents its size, and the sign represents its direction.
     * Right-moving asteroids are positive, left-moving are negative.
     * Asteroids at the same position never meet. Determine the state of asteroids after all collisions.
     */

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                int top = stack.pop();

                if (Math.abs(asteroid) > top) {
                    // Current asteroid explodes the top one and survives
                    alive = true;
                } else if (Math.abs(asteroid) == top) {
                    // Both asteroids explode
                    alive = false;
                } else {
                    // Current asteroid is destroyed, push top back
                    stack.push(top);
                    alive = false;
                }
            }

            if (alive) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode Problem 735: Asteroid Collision ===\n");

        int[] asteroids1 = { 5, 10, -5 };
        int[] result1 = asteroidCollision(asteroids1);
        System.out.println("Input: asteroids = [5,10,-5]");
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println("Explanation: The 10 and -5 collide, resulting in 10. The 5 and 10 never collide.");

        System.out.println();

        int[] asteroids2 = { 8, -8 };
        int[] result2 = asteroidCollision(asteroids2);
        System.out.println("Input: asteroids = [8,-8]");
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Explanation: The 8 and -8 collide, exploding each other.");

        System.out.println();

        int[] asteroids3 = { 10, 2, -5 };
        int[] result3 = asteroidCollision(asteroids3);
        System.out.println("Input: asteroids = [10,2,-5]");
        System.out.println("Output: " + Arrays.toString(result3));
        System.out.println("Explanation: The 2 and -5 collide, resulting in -5. The 10 and -5 collide, resulting in 10.");

        System.out.println();

        int[] asteroids4 = { -2, -1, 1, 2 };
        int[] result4 = asteroidCollision(asteroids4);
        System.out.println("Input: asteroids = [-2,-1,1,2]");
        System.out.println("Output: " + Arrays.toString(result4));
        System.out.println("Explanation: All asteroids move away from each other; no collisions occur.");
    }
}
