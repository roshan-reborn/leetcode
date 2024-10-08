class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen > tlen) return false;

        int i = 0;
        int j = 0;
        int total =0;

        while ((i < slen) && (j < tlen)){
            if (s.charAt(i) == t.charAt(j)){
                total++;
                i++;
                j++;
            } else j++;
        }
        return total == slen;
    }
}