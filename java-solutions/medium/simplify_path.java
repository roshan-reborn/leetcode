class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        List<String> skip = new ArrayList<>(Arrays.asList("..",".",""));
        for (String dir : path.split("/")){
            if (!stack.isEmpty() && dir.equals("..")) stack.pop();
            else if (!skip.contains(dir)) stack.push(dir);
        }
        String res = "";
        for (String dir:stack){
            res = "/" + dir + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}