class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int maxEl = 0;
        for (int i = 0; i < n; i++) {
            maxEl = Math.max(maxEl, nums[i]);
        }
        int T = 1;
        while (T <= maxEl) {
            T = T * 2;
        }
        boolean[] s1 = new boolean[T];
        boolean[] s2 = new boolean[T];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                s1[nums[i] ^ nums[j]] = true;
            }
        }
        for (int i = 0; i < T; i++) {
            if (s1[i]) {
                for (int num : nums) {
                    s2[i ^ num] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < T; i++) {
            if (s2[i]) {
                count++;
            }
        }
        return count;
    }
}