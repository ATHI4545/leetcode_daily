class Solution {
    public int leastInterval(char[] tasks, int n) {
     int[] freq=new int[26];

     for(char ch:tasks){
        freq[ch-'A']++;
     }

     int maxfreq=0;

     for(int i:freq){
        maxfreq=Math.max(maxfreq,i);
     }   

     int maxcount=0;

     for(int j:freq){
        if(j==maxfreq){
            maxcount++;
        }
     }

     int ans=(maxfreq-1)*(n+1)+maxcount;
     return Math.max(ans,tasks.length);
    }
}