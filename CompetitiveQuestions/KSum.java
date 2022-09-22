import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {
    //nums is a sorted array
    public List<List<Integer>> kSum(int[] nums,long target, int start, int k){
        List<List<Integer>> result=new ArrayList<>();
        if(start==nums.length)return result;
        long average=target/k;
        if(nums[start]>average||average>nums[nums.length-1])return result;
        if(k==2)return twoSum(nums,target,start);
        for(int i=0;i<nums.length;i++){
            if(i==start||nums[i]!=nums[i-1]){
                for(List<Integer> subset: kSum(nums, target-nums[i],i+1,k-1)){
                    result.add(new ArrayList<>(nums[i]));
                    result.get(result.size()-1).addAll(subset);
                }
            }
        }
        return result;
    }
    public List<List<Integer>> twoSum(int[] nums, long target, int start){
        List<List<Integer>> res=new ArrayList<>();
        int lo=start,hi=nums.length-1;
        while(lo<hi){
            int currSum=nums[lo]+nums[hi];
            if(currSum<target||(lo>start&&nums[lo]==nums[lo-1])){
                lo+=1;
            }
            else if(currSum>target||(hi<nums.length-1&&nums[hi]==nums[hi+1])){
                hi-=1;
            }
            else{
                res.add(Arrays.asList(nums[lo++],nums[hi--]));
            }
        }
        return res;
    }
}
