class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i< nums.length;i++){
            
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                res[0] = map.get(complement);
                res[1] = i;
                break;
            }
                
            map.put(nums[i], i);
        }
        
        return res;
    }
}