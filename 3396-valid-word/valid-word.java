class Solution {
    public boolean isValid(String word) {
       int v=0;
       int con=0;
       if(word.length()<3){
        return false;
       }

       for(char ch:word.toCharArray()){
        if(Character.isLetter(ch)){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                v++;
            }else{
                con++;
            }
        }
        else if(!Character.isDigit(ch)){
            return false;
        }
       } 
       return v>=1 && con>=1;
    }
}