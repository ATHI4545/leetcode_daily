class Solution {
    public boolean hasMatch(String s, String p) {
 
        int startpos=p.indexOf('*');
        String head=p.substring(0,startpos);
        String tail=p.substring(startpos+1);

        int left=s.indexOf(head);
        int right=s.lastIndexOf(tail);

        if(left==-1 || right==-1) return false;

        return left+head.length()<=right;
    }
}