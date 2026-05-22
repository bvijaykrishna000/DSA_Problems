class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MAX_VALUE;
        long res = 0;
        for(int i=0;i < 3;i++){
            long temp = Long.MIN_VALUE;
            for(int j=0;j < nums.length;j++){
                if(nums[j] < max){
                    temp = Math.max(temp,nums[j]);
                }
            }
            if(i ==0){
                res = temp;
            }
            max = temp;
        }
        if(max == Long.MIN_VALUE){
            return (int)(res);
        }
        else{
            return (int)(max);
        }
    }
}