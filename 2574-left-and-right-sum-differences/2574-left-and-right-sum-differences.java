class Solution {
    public int[] leftRightDifference(int[] nums) {
        int temp[] = new int[nums.length];
        temp[0] = nums[0];
        for(int i=1; i < nums.length;i++){
            temp[i] = temp[i-1] + nums[i];
        }
        for(int i=nums.length-2;i >=0;i--){
            nums[i] = nums[i+1] + nums[i];
        }
        for(int i=0;i < nums.length;i++){
            nums[i] = Math.abs(nums[i]- temp[i]);
        }
        return nums;
    }
}