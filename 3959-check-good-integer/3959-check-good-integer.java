class Solution {
    public boolean checkGoodInteger(int n) {
        int ss =0;
        int s =0;
        while(n > 0){
            int k = n%10;
            ss += k*k;
            s += k;
            n /= 10;
        }
        if(ss - s >= 50){
            return true;
        }
        return false;
    }
}