class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int min =nums.length+1 , sum = nums[0] ,i=0,j =0, n = nums.length;
        while(i < n && j < n && i <= j){
            if(sum >= k ){
                min = Math.min(min,j-i+1);
                sum = sum - nums[i];
                i++;
            }
            else {
                j++;
                sum += (j < n)? nums[j] :0;
            }
        }
        return (min > n)?  0: min;
    }
}