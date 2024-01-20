class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        if (nums.length < 3) {
            return 0;
        }

        int index = 0, count = 0;
        int diff = nums[1] - nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            int curr_diff = nums[i + 1] - nums[i];
            if (curr_diff == diff) {
                index++;
            } else {
                index = 0;
                diff = curr_diff;
            }
            count = count + index;
        }

        return count;

    }
}