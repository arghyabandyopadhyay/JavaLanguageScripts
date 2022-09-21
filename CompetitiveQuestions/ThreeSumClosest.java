//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//        Return the sum of the three integers.
//
//        You may assume that each input would have exactly one solution.
//
//
//
//        Example 1:
//
//        Input: nums = [-1,2,1,-4], target = 1
//        Output: 2
//        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//        Example 2:
//
//        Input: nums = [0,0,0], target = 1
//        Output: 0
//
//
//        Constraints:
//
//        3 <= nums.length <= 1000
//        -1000 <= nums[i] <= 1000
//        -104 <= target <= 104
//

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int res=nums[0]+nums[1]+nums[nums.length-1];
        int low,high,current_sum;
        for(int i=0;i<nums.length-2;i+=1){
            low=i+1;
            high=nums.length-1;
            while(low<high){
                current_sum=nums[low]+nums[high]+nums[i];
                if(Math.abs(current_sum-target)<Math.abs(res-target))res=current_sum;
                if(current_sum<target){
                    low+=1;
                }
                else {
                    high-=1;
                }
            }
        }
        return res;
    }
}
