class Solution {
    public String reverseVowels(String s) {
        if ((s==null) || (s.length()==0)) return s;
        int left = 0, right = s.length()-1;
        char[] c = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(left<right){
            while (left<right && !vowels.contains(c[left]+"")) left++;
            while (left<right && !vowels.contains(c[right]+"")) right--;
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return new String(c);
    }
}