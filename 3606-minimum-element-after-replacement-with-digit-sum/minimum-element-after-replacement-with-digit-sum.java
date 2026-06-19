class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            int sum=0;
            while(cur!=0){
                int t=cur%10;
                sum =t+sum;
                cur/=10;
            }
            min=Math.min(min,sum);
        }

        return min;
    }
}