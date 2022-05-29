class Solution {
  public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> cache = new HashMap<>();
            int secondTarget = 0;
            for(int i=0;i<nums.length;i++){
                if(!cache.containsKey(nums[i]))
                    cache.put(nums[i],i);
                secondTarget = target - nums[i];
                if(cache.containsKey(secondTarget)){
                    if(i!=cache.get(secondTarget)){
                        return new int[]{cache.get(secondTarget),i};
                    }
                }
                    
            }
            return new int[]{0,0};
        }

}