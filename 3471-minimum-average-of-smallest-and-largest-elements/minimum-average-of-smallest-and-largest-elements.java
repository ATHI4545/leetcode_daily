class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int left=0;
        int right=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(left<right){
            int avg=nums[left]+nums[right];

            if(avg<min){
                min=avg;
            }

            left++;
            right--;
        }
        return (double)min/2;
    }
}