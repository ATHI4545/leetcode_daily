class Solution {


    private void rev(int[] nums, int st,int end){
        while(st<end){ 
            int t=nums[st];
            nums[st]=nums[end];
            nums[end]=t;

            st++;
            end--;
        
    }
    }
    public void rotate(int[] nums, int k) {
     int n=nums.length;

      k=k%n;

     rev(nums,0,n-1);
     rev(nums,0,k-1);
     rev(nums,k,n-1);



    }
}