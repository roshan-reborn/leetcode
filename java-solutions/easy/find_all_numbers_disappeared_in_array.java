import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int c: nums) {
            seen.add(c);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!seen.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}