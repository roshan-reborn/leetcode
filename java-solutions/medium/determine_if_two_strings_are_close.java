class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (char c: word1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for (char c: word2.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        List<Integer> val1 = new ArrayList<>(map1.values());
        List<Integer> val2 = new ArrayList<>(map2.values());
        Collections.sort(val1);
        Collections.sort(val2);
        return val1.equals(val2) && map1.keySet().equals(map2.keySet());
    }
}