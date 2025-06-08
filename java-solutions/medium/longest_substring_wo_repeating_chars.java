class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;
        HashSet<Character> charSet = new HashSet<>();
        for (int right=0; right<s.length(); right++){
            if (!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLen = Math.max(maxLen,right-left+1);
            }else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLen;
    }
}