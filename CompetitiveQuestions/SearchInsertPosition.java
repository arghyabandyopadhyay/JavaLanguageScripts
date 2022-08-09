//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//        Example 3:
//
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//        nums contains distinct values sorted in ascending order.
//        -104 <= target <= 104

public class SearchInsertPosition {
    public int binarySearch(int arr[], int start, int end, int target){
        if (end >= start) {
            int mid = start + (end -start) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == target)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > target)
                return binarySearch(arr, start, mid - 1, target);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, end, target);
        }

        // We reach here when element is not present
        // in array
        return start;
    }
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    //Linear method O(n)
    //  public int searchInsert(int[] nums, int target) {
    //     if(nums[0]==target||nums[0]>target)return 0;
    //     int i=1;
    //     for(;i<nums.length;i++){
    //         if(nums[i]==target)return i;
    //         if(nums[i-1]<target&&nums[i]>target)return i;
    //     }
    //     return i;
    // }
}
