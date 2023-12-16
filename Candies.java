import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] candiesArr = { 4, 2, 1, 1, 2 };
        int extraCandies = 1;
        int[] addedCandies = new int[candiesArr.length];
        for (int i = 0; i < candiesArr.length; i++) {
            addedCandies[i] = candiesArr[i] + extraCandies;
        }
        System.out.println(Arrays.toString(addedCandies));

        int maxCandies = addedCandies[0];
        for (int i = 0; i < addedCandies.length; i++) {
            if (addedCandies[i] > maxCandies) {
                maxCandies = addedCandies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < addedCandies.length; i++) {
            result.add(addedCandies[i] + extraCandies >= maxCandies);
        }

        System.out.println(result);
        ;
    }
}
