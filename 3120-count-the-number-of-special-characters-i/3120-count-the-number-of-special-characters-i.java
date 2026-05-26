class Solution {
    public int numberOfSpecialChars(String word) {
        int count =0;
        int arr[] = new int[125];
        for(int i=0;i < word.length();i++){
            char c = word.charAt(i);
            arr[(int)c]++;
        }
        for(int i=65;i <= 90;i++){
            if(arr[i] > 0 && arr[i+32] > 0){
                count++;
            }
        }
        return count;
    }
}