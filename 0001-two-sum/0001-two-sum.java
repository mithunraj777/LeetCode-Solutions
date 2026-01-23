class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+","+"]");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        Solution sol = new Solution();
        int result[] = sol.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}