class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");

        for (int i = 0; i < str.length - 1; i++) {
            int len = str[i].length() - 1;

            if (str[i].charAt(len) != str[i + 1].charAt(0)) {
                return false;
            }
        }

        String first = str[0];
        String last = str[str.length - 1];

        if (last.charAt(last.length() - 1) != first.charAt(0)) {
            return false;
        }

        return true;
    }
}