import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArr {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 0 };
        int[] index = { 0, 1, 2, 3, 0 };

        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] target = new int[targetList.size()];

        // this takes the arraylist converts it into stream pipeline using
        // "targetList.stream()" then it takes the stream and feds
        // it into mapToInt method which converts it into the primitive int datatype
        // using the "Integer::intValue" method and then
        // the "to.Array()" collects the elements in an array and feds it into the new
        // array created called target.
        target = targetList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(target));
    }
}