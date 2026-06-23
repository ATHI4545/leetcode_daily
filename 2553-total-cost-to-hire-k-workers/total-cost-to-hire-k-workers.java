class Solution {
    public long totalCost(int[] arr, int k, int candidates) {
        PriorityQueue<Integer> pp1=new PriorityQueue<>();
        PriorityQueue<Integer> pp2=new PriorityQueue<>();

        int left=0;
        int right=arr.length-1;
        long ans=0;
        while(k-->0){
            while(pp1.size()<candidates && left<=right){
                pp1.offer(arr[left++]);
            }
            while(pp2.size()<candidates && left<=right){
                pp2.offer(arr[right--]);
            }

            int t1=pp1.size()>0? pp1.peek():Integer.MAX_VALUE;
            int t2=pp2.size()>0? pp2.peek():Integer.MAX_VALUE;


            if(t1<=t2){
                ans+=t1;
                pp1.poll();
            }else{
                ans+=t2;
                pp2.poll();
            }
            
        }
        return ans;
    }
}