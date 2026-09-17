class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> mp=new ArrayList<>(map.entrySet());

        mp.sort((a,b) ->
        {
        if(a.getValue().equals(b.getValue())){ 

        return b.getKey() - a.getKey();
        }
        return a.getValue() - b.getValue();
});

        int index=0;
        int[] res=new int[nums.length];



        for(Map.Entry<Integer,Integer>entry:mp){
            int value=entry.getValue();
            int key=entry.getKey();

            for(int j=0;j<value;j++){
                res[index++]=key;
            }
        }

        return res;
    }
}