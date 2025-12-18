public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorAll = 0;
        int xorArray = 0;

        for (int i = 0; i <= n; i++) {
            xorAll ^= i;
        }

        for (int num : nums) {
            xorArray ^= num;
        }

        return xorAll ^ xorArray;
    }
}
