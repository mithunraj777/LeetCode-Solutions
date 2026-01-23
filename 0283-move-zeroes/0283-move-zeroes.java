class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int pos = 0;
        for(int i=0;i<l;i++){
            if(nums[i]!=0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        for(int i=pos;i<l;i++){
            nums[i]=0;
        }
        System.out.print("[");
        for(int i=0;i<l;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println("]");
    }
}