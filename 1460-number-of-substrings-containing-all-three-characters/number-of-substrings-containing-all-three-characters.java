class Solution {
    public int numberOfSubstrings(String s) {
        int start=0;
        int count=0;

        HashMap<Character, Integer> freq=new HashMap<>();

        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            freq.put(c,freq.getOrDefault(c,0)+1);

            while(freq.size()==3){
                count +=s.length()-end;
                char ch=s.charAt(start);
                freq.put(ch,freq.get(ch)-1);
             if(freq.get(ch)==0){
                freq.remove(ch);
             }   
             start++;
            }
        }
        return count;
    }
}