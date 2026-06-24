class Solution {
    public String[] sortPeople(String[] names, int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                String t=names[i];
                names[i]=names[j];
                names[j]=t;
            }
        }
        return names;
    }
}