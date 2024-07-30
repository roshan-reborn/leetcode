class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sList = s.split(" ");
        if (pattern.length() != sList.length){
            return false;
        }
        HashMap map = new HashMap<>();
        for (Integer i=0; i<pattern.length();i++){
            if (map.put(pattern.charAt(i), i) != map.put(sList[i], i)){
                return false;
            }
        }
        return true;
    }
}