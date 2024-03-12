class Solution {
    public int[] productExceptSelf(int[] nums) {
        long totalProduct = 1;
        int zeroCount = 0;
        int productWithoutZero = 1;
        for (int num : nums) {
            totalProduct *= num;
            if (num == 0) {
                zeroCount++;
            }
            if (num != 0) {
                productWithoutZero *= num;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroCount == 1) {
                nums[i] = productWithoutZero;
            } else if (nums[i] == 0 && zeroCount > 1) {
                nums[i] = 0;
            } else {
                nums[i] = (int) totalProduct / nums[i];
            }
        }
        return nums;
    }
}
