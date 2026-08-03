class Solution {
    public boolean isCircularSentence(String sentence) {
     String[] arr=sentence.split(" ");

     int len=arr.length;
    if(arr[0].charAt(0)!=arr[len-1].charAt(arr[len-1].length()-1)){
            return false;
    }
     for(int i=0;i<len-1;i++){

        char last=arr[i].charAt(arr[i].length()-1);
        char first=arr[i+1].charAt(0);

        if(last!=first){
            return false;
        }

     }

     return true;
    }
}