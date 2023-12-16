import java.util.Arrays;

public class GoodPair {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1 };
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
