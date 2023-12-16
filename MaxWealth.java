public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 }
        };

        int maxWealth = Integer.MIN_VALUE;

        for (int rows = 0; rows < accounts.length; rows++) {
            int rowSum = 0; // Initialize rowSum for each row
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                rowSum += accounts[rows][cols];
            }

            maxWealth = Math.max(maxWealth, rowSum);
            System.out.println(maxWealth);
        }
    }

}
