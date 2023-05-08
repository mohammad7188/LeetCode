class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        String a = s.trim();
        for(int i = a.length()-1;i>=0;i--){
            if(a.charAt(i) != ' ') length ++;
        else return length;
        }
        return length;
    }
}
