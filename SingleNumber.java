class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(Integer i : nums){
            ans ^= i;
        }
        return ans;
        
    }
}
