class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] values = new int[n];
        int[] freq = new int[n];
        int idx = 0;
        int count = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                count++;
            } else {
                values[idx] = nums[i-1];
                freq[idx] = count;
                idx++;
                count = 1;
            }
        }
        values[idx] = nums[n-1];
        freq[idx] = count;
        idx++;
        for(int i = 0; i < idx-1; i++){
            for(int j = i+1; j < idx; j++){
                if(freq[i] < freq[j]){
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    int t = values[i];
                    values[i] = values[j];
                    values[j] = t;
                }
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = values[i];
        }
        return result;
    }
}