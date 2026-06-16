class Solution {
    public int[] countBits(int n) {
        int temp[] = new int[n+1];
        temp[0] = 0;
        for(int i=1;i <=n;i++){
            int res = 0;
            int k = i;
            while(k > 0){
                if((k & 1) == 1){
                    res++;
                }
                k = k >> 1;
            }
            temp[i] = res;
        }
        return temp;
    }
}