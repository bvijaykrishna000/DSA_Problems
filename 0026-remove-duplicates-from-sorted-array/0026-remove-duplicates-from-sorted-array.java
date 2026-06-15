class Solution {
    public int removeDuplicates(int[] nums) {
       TreeSet<Integer> s = new TreeSet<>();
       for(int i=0;i < nums.length;i++){
        s.add(nums[i]);
       }
       int k = 0;
       for(int x:s){
        nums[k++] = x; 
       }

       return s.size();
    }
}