class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year=new int[101];

        for(int[] l:logs){
            year[l[0]-1950]++;
            year[l[1]-1950]--;
        }

        int max=0;int pop=0;int result=0;

        for(int i=0;i<101;i++){
            pop+=year[i];
            if(pop>max){
                max=pop;
                result=i;
            }
        }

        return result+1950;
    }
}