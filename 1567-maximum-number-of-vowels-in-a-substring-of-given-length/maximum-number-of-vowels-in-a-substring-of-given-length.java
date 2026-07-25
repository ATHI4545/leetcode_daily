class Solution {

    public boolean isvowel(char c){
        return c=='a'|| c=='e' ||c=='i' || c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int left=0;
        int vow=0;
        

        for(int right=0;right<s.length();right++){
            if(isvowel(s.charAt(right))) vow++;

            if(right-left+1==k){
                max=Math.max(max,vow);
                if(isvowel(s.charAt(left))) vow--;
                left++;
            }
        }
        return max;
    }
}