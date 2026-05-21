class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        int r = n-k+1;
        for(int x : map.keySet()){
            r = r - map.get(x);
            if(r <= 0){
                return x;
            }
        }
        return -1;
    }
}