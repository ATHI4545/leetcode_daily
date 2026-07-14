class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!lst.contains(nums1[i])){ 
                    lst.add(nums1[i]);
                    }
                }
            }
        }

        int[] res=new int[lst.size()];

        for(int i=0;i<lst.size();i++)
        {
            res[i]=lst.get(i);
        }

        return res;
    }
}