class Solution {
    public String processStr(String s) {
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray()){
            if('a'<=ch && 'z'>=ch){
                str.append(ch);
            }
            else if(ch=='*'){
                if(str.length()!=0){
                str.deleteCharAt(str.length()-1);
                }
            }
            else if(ch=='#'){
                str.append(str.toString());
            }
            else{
                str.reverse();
            }
        }
    
    return str.toString();
    }
}