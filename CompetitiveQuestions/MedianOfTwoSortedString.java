class MedianOfTwoSortedString {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length=nums1.length;
        int nums2Length=nums2.length;
        int loopLen=nums1Length+nums2Length;
        loopLen=(loopLen%2==0)?((loopLen/2)+1):((loopLen+1)/2);
        int nums1i=0,nums2i=0;
        int max=0,lastMax=0;
        int k=0;
        while(nums1i<nums1Length&&nums2i<nums2Length&&k<loopLen){
            if(nums1[nums1i]<=nums2[nums2i]){
                lastMax=max;
                max=nums1[nums1i++];
                k=k+1;
            }
            else{
                lastMax=max;
                max=nums2[nums2i++];
                k=k+1;
            }
        }
        while(nums1i<nums1.length&&k<loopLen){
            lastMax=max;
            max=nums1[nums1i++];
            k=k+1;
        }
        while(nums2i<nums2.length&&k<loopLen){
            lastMax=max;
            max=nums2[nums2i++];
            k=k+1;
        }
        return ((nums1Length+nums2Length)%2==0)?((max+lastMax)/2.0):(max);
    }
    public static void main(String[] args){
        int[] num1=new int[]{1,3,6,8,20};
        int[] num2=new int[]{2,5,7,9,21,25};
        MedianOfTwoSortedString m=new MedianOfTwoSortedString();
        System.out.println(m.findMedianSortedArrays(num1,num2));
    }
}
