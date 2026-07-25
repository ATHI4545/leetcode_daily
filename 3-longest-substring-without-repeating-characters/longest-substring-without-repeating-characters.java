class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;

        int len=s.length();

        int st=0;
        int end=0;
        Set<Character> charset=new HashSet<>();

        while(end<len){
            char ch=s.charAt(end);

            if(charset.contains(ch)){
                charset.remove(s.charAt(st));
                st++;
            }

            else{
                charset.add(ch);
                max=Math.max(max,end-st+1);
                end++;
            }
        }
        return max;
    }
}