class Solution {
    public int majorityElement(int[] nums) {
        int max=nums.length/2;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==cur){
                    count++;
                }
            }

            if(count>max){
                return nums[i];
            }
        }
return -1;
        
    }
}