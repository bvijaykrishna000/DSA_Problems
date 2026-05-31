class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for(int i = arr.length-1;i >=0;i--){
             if(st.isEmpty()){
                res[i] = 0;
                st.push(i);
             }
             else{
                while(!(st.isEmpty()) && arr[st.peek()] <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[i] = 0;
                    st.push(i);
                }
                else{
                    res[i] = Math.abs(i-st.peek());
                    st.push(i);
                }
             }
        }
        return res;
    }
}