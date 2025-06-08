class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 = Arrays.stream(nums1).boxed().distinct().collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(nums2).boxed().distinct().collect(Collectors.toList());
        Set<Integer> commonElements = new HashSet<>(l1);
        commonElements.retainAll(l2);
        l1.removeAll(commonElements);
        l2.removeAll(commonElements);
        List<List<Integer>> res = new ArrayList<>();
        res.add(l1);
        res.add(l2);
        return res;
    }
}