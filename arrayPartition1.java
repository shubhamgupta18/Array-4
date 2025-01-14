//Time complexity O(nlogn)
//Space complexity O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
        
        if(nums.length == 0){
            
            return 0;
        }
        
        Arrays.sort(nums);
        
        int result = 0;
        
        for(int i = 0; i < nums.length; i = i + 2)
        {
            
            result = result + nums[i];
        }
        
        return result;
        
    }
}