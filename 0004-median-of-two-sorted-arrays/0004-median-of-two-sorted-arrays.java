class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        for(int i=0;i<merged.length;i++){
            for(int j=i+1;j<merged.length;j++){
                if(merged[i]>merged[j]){
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        int l = merged.length;
        if(l%2==0){
            int r = l/2;
            return (merged[r-1]+merged[r])/2.0;
        }
        else{
            int r = l/2;
            int median = merged[r];
            return median;
        }
    }
}