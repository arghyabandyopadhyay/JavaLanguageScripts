//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//        Notice that the solution set must not contain duplicate triplets.
//
//
//
//        Example 1:
//
//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
//        Explanation:
//        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//        The distinct triplets are [-1,0,1] and [-1,-1,2].
//        Notice that the order of the output and the order of the triplets does not matter.
//        Example 2:
//
//        Input: nums = [0,1,1]
//        Output: []
//        Explanation: The only possible triplet does not sum up to 0.
//        Example 3:
//
//        Input: nums = [0,0,0]
//        Output: [[0,0,0]]
//        Explanation: The only possible triplet sums up to 0.
//
//
//        Constraints:
//
//        3 <= nums.length <= 3000
//        -105 <= nums[i] <= 105

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new LinkedList<>();
        int sum,low,high;
        for(int i=0;i<nums.length-2;i+=1){
            if(i == 0 || nums[i] != nums[i - 1]){
                sum= -nums[i];
                low=i+1;
                high=nums.length-1;
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high&&nums[low]==nums[low+1])low+=1;
                        while(low<high&&nums[high]==nums[high-1])high-=1;
                        low+=1;
                        high-=1;
                    }
                    else if(nums[low]+nums[high]<sum){
                        low+=1;
                    }
                    else high-=1;
                }
            }
        }
        return result;
    }
}
