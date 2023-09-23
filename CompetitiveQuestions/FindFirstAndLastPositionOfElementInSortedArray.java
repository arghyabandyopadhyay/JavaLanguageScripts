// 34. Find First and Last Position of Element in Sorted Array
// Medium
// 18.6K
// 447
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109

class FindFirstAndLastPositionOfElementInSortedArray {
    int min=Integer.MAX_VALUE,max=-1;
    public int[] searchRange(int[] nums, int target) {
        modifiedBinarySearch(nums,target,0,nums.length-1);
        if(min!=Integer.MAX_VALUE)return new int[]{min,max};
        else return new int[]{-1,-1};
    }
    public void modifiedBinarySearch(int[] nums, int target, int start, int end){
      if(start>end)return ;

      int mid=(start+end)/2;
      if(nums[mid]==target){
        min=Math.min(min,mid);
        max=Math.max(max,mid);
        modifiedBinarySearch(nums, target, mid+1,end);
        modifiedBinarySearch(nums, target, start, mid-1);
      }
      else if(nums[mid]<target)modifiedBinarySearch(nums, target, mid+1,end);
      else modifiedBinarySearch(nums, target, start, mid-1);
    }

}
