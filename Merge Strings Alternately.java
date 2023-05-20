class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        int a = word1.length();
        int b = word2.length();
        while(p1<a || p2<b){
            if(p1<a) st.append(word1.charAt(p1++));
            if(p2<b) st.append(word2.charAt(p2++));

        }
        return st.toString();
    }
}
