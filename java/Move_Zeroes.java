class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; // slow pointer

        // Move non-zero elements to the front
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Fill the remaining with zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
