class Solution {
    public int[] runningSum(int[] nums) {
        if(nums==null || nums.length==0) return nums;
        int[] result = new int[nums.length];
        int previousValue=0;
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i]+previousValue;
            previousValue=result[i];
        }
        return result;
        
    }
}