class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=0;
        int max = 0;
        if(k >= n){
            return n;
        }
        int z =0;
        if(nums[0] == 0){
            z++;
        }
        while(i < n && j < n){
            if(z <= k){
                max = Math.max(max,j-i+1);
            }
            if(z > k){
                if(nums[i] == 0){
                    z--;
                }
                i++;
            }
            else{
                j++;
                if(j < n && nums[j] == 0){
                    z++;
                }
            }
        }
        return max;
    }
}