class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for(int num:nums1) {
            set1.add(num);
        }

        for(int num:nums2) {
            set2.add(num);
            if(set1.add(num)) {
                diff2.add(num);
            }
        }

        for(int num: nums1) {
            if(set2.add(num)) {
                diff1.add(num);
            }
        }

        return List.of(diff1, diff2);
    }
}
