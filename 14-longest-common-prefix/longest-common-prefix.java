class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index=0;


        Arrays.sort(strs);

        String str1=strs[0];
        String str2=strs[strs.length-1];

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return index==0?"" :str1.substring(0,index);
    }
}