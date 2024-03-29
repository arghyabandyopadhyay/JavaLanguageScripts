// Next Permutation
// Medium
// 17K
// 4.3K
// Companies
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]
// Example 2:

// Input: nums = [3,2,1]
// Output: [1,2,3]
// Example 3:

// Input: nums = [1,1,5]
// Output: [1,5,1]
 

// Constraints:

// 1 <= nums.length <= 100
// 0 <= nums[i] <= 100
  
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i, j;
        // Find for the pivot element.
        // A pivot is the first element from
        // end of sequence which doesn't follow
        // property of non-increasing suffix
        for (i = n - 2; i >= 0; i--) {
          if (nums[i] < nums[i + 1]) break;
        }    
        // Check if pivot is not found
        if (i < 0) reverse(nums, 0, nums.length - 1);    
        // if pivot is found
        else {    
          // Find for the successor of pivot in suffix
          for (j = n - 1; j > i; j--) {
            if (nums[j] > nums[i]) {
              break;
            }
          }    
          // Swap the pivot and successor
          swap(nums, i, j);    
          // Minimise the suffix part
          reverse(nums, i + 1, nums.length - 1);
        }
    }    
    void reverse(int[] arr, int start, int end)
    {
      //Swaps last element with the first and so on..
      while (start < end) swap(arr, start++, end--);
    } 
    void swap(int[] arr, int i, int j)
    {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
}
