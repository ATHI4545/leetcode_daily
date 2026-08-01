class Solution {
    public int lengthOfLongestSubstring(String s) {
       int st=0;
       int end=0;
       int max=0;
       Set<Character> set=new HashSet<>();
       while(end<s.length()){
        char ch=s.charAt(end);
        
        if(set.contains(ch)){
            set.remove(s.charAt(st));
            st++;
        }

        else{
            set.add(ch);
            max= Math.max(max,end-st+1);
            end++;
        }
       }

       return max;
    }
}