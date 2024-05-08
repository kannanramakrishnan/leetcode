class LongestSubarrayOfOnes {
    public int longestSubarray(int[] nums) {
       int left = 0, right = 0, count = 0, ans = 0;

       while(right < nums.length) {
        if(nums[right] == 0) {
            count++;
        }

        while(count > 1) {
            if(nums[left] == 0) {
                count--;
            }
            left++;
        }
        ans = Math.max(ans, right-left+1);
        right++;
       }
       return ans-1;
    }
}
