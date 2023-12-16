public class SmallerNos {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            int counter = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] != nums[j] && nums[j] < nums[i]) {
                    counter++;
                }
            }
            result[i] = counter;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(i);
        }

    }
}
