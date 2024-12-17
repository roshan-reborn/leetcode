class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0; int j=0;
        int n = word1.length();
        int m = word2.length();
        StringBuilder merged = new StringBuilder();
        while(i<n && j<m){
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        while(i<n){
            merged.append(word1.charAt(i++));
        }
        while(j<m){
            merged.append(word2.charAt(j++));
        }
        return merged.toString();
    }
}