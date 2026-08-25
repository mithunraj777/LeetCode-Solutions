class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length+nums2.length;
       int[] arr=new int[n];
       int min;
       if(nums1.length>nums2.length){
        min=nums2.length;
       }
       else{
        min=nums1.length;
       }
       for(int i=0;i<nums1.length;i++){
        arr[i]=nums1[i];
       }
       int k=0;
       for(int i=nums1.length;i<n;i++){
        arr[i]=nums2[k];
        k++;
       }
       Arrays.sort(arr);
       int m=arr.length;
       if(m%2==0){
        return ((arr[m/2]+arr[m/2-1])/2.0);
       }
       else{
        return (arr[m/2]);
       }
    }
}