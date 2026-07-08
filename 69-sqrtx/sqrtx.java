class Solution {
    public int mySqrt(int x) {

        if(x==0){
            return 0;
        }
     int f=1;
     int last=x;

     while(f<=last){

        int mid=f+(last-f)/2;

        if(mid==x/mid){
            return mid;
        }else if(mid>x/mid){
            last=mid-1;
        }else{
            f=mid+1;
        }
     }
      return last;  
    }
}