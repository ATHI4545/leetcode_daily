class Solution {
    public String truncateSentence(String s, int k) {
        
        String [] st= s.split(" ");
        StringBuilder str = new StringBuilder();

        for(int i=0;i<k;i++){
            str.append(st[i]);
            str.append(" ");
        }

        return str.toString().trim();
    }
}