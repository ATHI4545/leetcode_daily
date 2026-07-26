class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1=new int[26];

        for(int i=0;i<magazine.length();i++){
            freq1[magazine.charAt(i)-'a']++;
        }

        int count=ransomNote.length();

        for(int i=0;i<ransomNote.length();i++){
            if(freq1[ransomNote.charAt(i)-'a']!=0){
                freq1[ransomNote.charAt(i)-'a']--;
                count--;
            }
        }

        return count==0?true:false;
    }
}