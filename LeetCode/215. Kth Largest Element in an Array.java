class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);

    }

    private int quickSelect(int[] nums, int left, int right, int kSmallest) {
        if (left == right) {
            return nums[left];
        }
        int i = left - 1;
        int j = right + 1;
        int pivot = nums[(left + right) >>> 1];

        while (i < j) {

            do {
                i++;
            } while (nums[i] < pivot);


            do {
                j--;
            } while (nums[j] > pivot);

            if (i < j) {
                swap(nums, i, j);
            }
        }


        if (j >= kSmallest) {
            return quickSelect(nums, left, j, kSmallest);
        }
        return quickSelect(nums, j + 1, right, kSmallest);
    }

    // Swap function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}