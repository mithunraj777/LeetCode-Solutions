class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] g = new int[l1];
        int curr;
        for(int i=0;i<l1;i++){
            g[i]=-1;
        }
        for(int i=0;i<l1;i++){
            curr=nums1[i];
            for(int j=0;j<l2;j++){
                if(nums2[j]==curr){
                    for (int k = j + 1; k < l2; k++) {
                        if (nums2[k] > curr) {
                            g[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return g;
    }
}