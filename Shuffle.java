import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = nums.length / 2;

        int[] result = new int[n * 2];

        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        System.out.println(result);

    }
}
