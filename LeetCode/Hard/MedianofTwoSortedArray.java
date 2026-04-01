class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  
        int[] merged_array= new int[nums1.length+nums2.length];
        int index=0,median;
        for(int n:nums1)
           merged_array[index++]=n;
        for(int n:nums2)
           merged_array[index++]=n;
        int len=merged_array.length;
        Arrays.sort(merged_array);
        if(len%2==0)
            return (((merged_array[(len/2-1)])+(merged_array[len/2]))/2.0);
        else
           return merged_array[len/2];
        
    }
}
