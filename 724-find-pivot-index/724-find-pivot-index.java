class Solution {
    public int pivotIndex(int[] nums) {
      for(int i=0;i<nums.length;i++) {
            int leftSum=0;
            int rightSum=0;
            for(int l=i-1;l>=0;l--){ //left sum
                leftSum+=nums[l];
            }
            for(int r=i+1;r<nums.length;r++){ //right sum
                rightSum+=nums[r];
            }

            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}