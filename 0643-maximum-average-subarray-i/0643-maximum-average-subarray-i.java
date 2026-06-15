class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int temp[] = new int[nums.length];
        temp[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            temp[i] = nums[i] + temp[i-1];
        }

        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double res = sum / k;

        if(k == nums.length){
            return res;
        }

        int f = 0;

        for(int i = k; i < nums.length; i++){

            sum = sum + nums[i] - nums[f];

            res = Math.max(res, sum / k);

            f++;
        }

        return res;
    }
}