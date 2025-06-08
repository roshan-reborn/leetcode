class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strBuild = new Stack<>();
        StringBuilder res = new StringBuilder();
        int n = 0;
        for(char c: s.toCharArray()){
            if (Character.isDigit(c)){
                n = n * 10 + c -'0';
            }
            else if (c=='[') {
                numStack.push(n);
                strBuild.push(res);
                n=0;
                res = new StringBuilder();
            }
            else if (c==']'){
                int count = numStack.pop();
                StringBuilder temp = res;
                res = strBuild.pop();
                while(count-->0){
                    res.append(temp);
                }
            }
            else {
                res.append(c);
            }
        }
        return res.toString();
    }
}