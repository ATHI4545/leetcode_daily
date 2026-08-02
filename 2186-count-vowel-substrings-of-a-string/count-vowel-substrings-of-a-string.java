class Solution {
    public int countVowelSubstrings(String word) {
        int vow=0;
        Set<Character> s=new HashSet<>();
        for(int i=0;i<word.length()-4;i++){
            s.clear();
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){ 
                s.add(ch);

                if(s.size()==5){
                    vow++;
                }
                }
                else{
                    break;
                }

            }

        }
        return vow;
    }
}