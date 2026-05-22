class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i=0 ,j =0 ,max = 0, z = 0;
        if(k >= n){
            return n;
        }
        if(nums[0] == 0){
            z++;
        }
        while(i < n && j < n){
            if(z <= k){
                max = Math.max(max,j-i+1);
                j++;
                if(j < n && nums[j] == 0){
                    z++;
                }
            }
            else{
                if(nums[i] == 0){
                    z--;
                }
                i++;
            }
        }
        return max;
    }
}