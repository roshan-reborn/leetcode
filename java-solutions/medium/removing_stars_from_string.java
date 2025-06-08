class Solution {
    public String removeStars(String s) {
        Deque<Character> charStack = new ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (c=='*') charStack.pop();
            else charStack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c: charStack){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}