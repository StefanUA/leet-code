package easy;

class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;

        for (int i = 0; i < nums.length && result == null; i++) {
            result = twoSum(nums, target, i, 0);
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target, int searchIndex, int currIndex) {
        int[] result = null;
        if (currIndex >= 0 && currIndex < nums.length && searchIndex >= 0 && searchIndex < nums.length) {
            if (searchIndex != currIndex && nums[searchIndex] + nums[currIndex] == target) {
                result = new int[] { searchIndex, currIndex };
            } else {
                result = twoSum(nums, target, searchIndex, (2 * currIndex) + 1);
                if (result == null) {
                    result = twoSum(nums, target, searchIndex, (2 * currIndex) + 2);
                }
            }
        }
        return result;
    }
}