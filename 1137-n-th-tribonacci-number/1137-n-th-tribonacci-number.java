class Solution {
    public int tribonacci(int n) {
        int arr[] = new int[n+1];
        if(n ==0){
            return 0;
        }
        if(n  <=2){
            return 1;
        }
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i=0;i < n-2;i++){
            arr[i+3] = arr[i] + arr[i+1] + arr[i+2];
        }
        return arr[n];
    }
}