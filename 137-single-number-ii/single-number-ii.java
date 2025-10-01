class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
    for (int i = 0; i < 32; i++) {
        int bitCount = 0;
        for (int num : nums) {
            bitCount += ((num >> i) & 1);
        }
        if (bitCount % 3 != 0) {
            result |= (1 << i);
        }
    }
    // Handle negative numbers.
    return result;
    }
}