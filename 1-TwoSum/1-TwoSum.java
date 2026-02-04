// Last updated: 2/4/2026, 9:41:06 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};  
    }
}