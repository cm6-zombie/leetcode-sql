import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int alt_num = target - nums[i];

            if(map.containsKey(alt_num)){
                return new int[]{map.get(alt_num),i};
            }
            map.put(nums[i],i);
        }
     return new int[]{};
    }
}