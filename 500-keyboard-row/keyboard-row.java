class Solution {
    public String[] findWords(String[] words) {
     String first="qwertyuiop";
     String second="asdfghjkl";
     String third="zxcvbnm";

     ArrayList<String>lst=new ArrayList<>();

     for(String i:words){

        if(isrow(i,first) || isrow(i,second) || isrow(i,third)){
            lst.add(i);
        }
     }

     return lst.toArray(new String[0]);   
    }

    private boolean isrow(String c,String f){
        for(char ch:c.toCharArray()){
            if(f.indexOf(Character.toLowerCase(ch))==-1){
                return false;
            }
        }
        return true;
    }
}