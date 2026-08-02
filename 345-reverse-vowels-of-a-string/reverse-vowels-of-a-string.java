class Solution {

    public String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        Set<Character> vow=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int st=0;
        int end=s.length()-1;
        while(st<end){
          while(st<end && !vow.contains(s.charAt(st))){
            st++;
          }while(st<end && !vow.contains(s.charAt(end))){
            end--;
          }

          if(st<end){
                char temp=chars[st];
                chars[st]=chars[end];
                chars[end]=temp;

                st++;
                end--;
          }
        }

        return new String(chars);
    }
}