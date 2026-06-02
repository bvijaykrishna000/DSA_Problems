class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2*n];
        for(int i = 2*n -1;i >= 0 ;i--){
            arr[i] = nums[i%n];
        }
        Stack<Integer> s = new Stack<>();
        for(int i=2*n -1;i >=0 ;i--){
            while(!(s.isEmpty()) && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nums[i%n] = -1;
            }
            else{
                nums[i%n] = arr[s.peek()];

            }
            s.push(i);

        }
        return nums;
    }
}