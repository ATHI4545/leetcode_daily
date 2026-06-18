class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int max=(int)target;

        for(int i=0;i<letters.length;i++){
            int cur=(int)letters[i];

           if(cur>max){
            return (char)cur;
           }
        }

        return letters[0];
    }
}