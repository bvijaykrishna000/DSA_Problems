class Solution {

    public int thirdMax(int[] nums) {

        long fmax = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            // Duplicate Skip
            if(nums[i] == fmax || nums[i] == smax || nums[i] == tmax)
                continue;

            if(nums[i] > fmax) {

                tmax = smax;
                smax = fmax;
                fmax = nums[i];

            } else if(nums[i] > smax) {

                tmax = smax;
                smax = nums[i];

            } else if(nums[i] > tmax) {

                tmax = nums[i];
            }
        }

        if(tmax == Long.MIN_VALUE)
            return (int)fmax;

        return (int)tmax;
    }
}