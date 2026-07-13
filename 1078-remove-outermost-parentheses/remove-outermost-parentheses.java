class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> ch=new Stack<>();
        StringBuilder str=new StringBuilder("");

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(ch.size()>0){
                    str.append(s.charAt(i));
                }
                ch.push(s.charAt(i));
            }else{
                ch.pop();

                if(ch.size()>0){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}