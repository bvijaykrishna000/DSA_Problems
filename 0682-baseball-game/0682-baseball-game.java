class Solution {
    public int calPoints(String[] str) {
        int arr[] = new int[str.length];
        int index = 0;
        for(int i=0;i < arr.length;i++){
            if(str[i].equals("C")){
                arr[index-1] = 0;
                index--;
            }
            else if(str[i].equals("D")){
                arr[index] = arr[index-1]*2;
                index++;
            }
            else if(str[i].equals("+")){
                arr[index] = arr[index-1] + arr[index-2];
                index++;
            }
            else {
                arr[index] += Integer.parseInt(str[i]);
                index++;
            }
        }
        int sum = 0;
        for(int i=0;i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}