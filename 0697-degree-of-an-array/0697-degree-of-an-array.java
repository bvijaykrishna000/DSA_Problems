class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> list = map.get(nums[i]);
                list.set(0, list.get(0) + 1);
                list.set(2,i);
            }
            else{
               ArrayList<Integer> temp =  map.computeIfAbsent(nums[i], k -> new ArrayList<>());
               temp.add(1);
               temp.add(i);
               temp.add(i);
            }
        }
        int cm =0;
        int lm = 0;
        int res =0;
        for(int i=0;i < nums.length;i++){
            ArrayList<Integer> t = map.get(nums[i]);
            if(t.get(0) > cm){
                cm = t.get(0);
                res = t.get(2) - t.get(1);
                lm = t.get(2) - t.get(1);
            }
            else if(t.get(0) == cm){
                if(t.get(2) - t.get(1) < lm){
                    res = t.get(2) - t.get(1);
                    lm = t.get(2) - t.get(1);
                }
            }
            else{
                ;
            }
        }
        return res +1;
    }
}