class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder(words.length);

        for(String str:words){
            int t=0;
            for(int i=0;i<str.length();i++){
                t+=weights[(str.charAt(i)-'a')];
            }

            res.append((char)('z'-(t%26)));
        }

        return res.toString();
    }
}