class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int j= 0;
        for(int i=columnTitle.length()-1;i >=0;i--){
            char c = columnTitle.charAt(i);
            int temp = (int)c - 64;
            if(sum == 0){
                sum = sum + temp;
            }
            else{
                sum = sum + (int)(Math.pow(26,j)*temp);
            }
            j++;
        }
        return sum ;
    }
}