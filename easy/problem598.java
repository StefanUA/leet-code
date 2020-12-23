package easy;

class Problem598 {
    public int maxCount(int m, int n, int[][] ops) {
        int[] count = { m, n };
        for (int i = 0; i < ops.length; i++) {
            int[] op = ops[i];
            count[0] = Math.min(op[0], count[0]);
            count[1] = Math.min(op[1], count[1]);
        }
        return count[0] * count[1];
    }
}