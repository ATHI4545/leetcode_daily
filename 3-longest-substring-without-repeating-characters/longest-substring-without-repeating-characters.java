class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set=new HashSet<>();

      int st=0;
      int end=0;
      int max=0;


      while(end<s.length()){

        char ch=s.charAt(end);

        if(set.contains(ch)){
            set.remove(s.charAt(st));
            st++;
        }
        else{
            set.add(s.charAt(end));
            max=Math.max(max,end-st+1);
            end++;
        }
      }
       return max;
    }
}