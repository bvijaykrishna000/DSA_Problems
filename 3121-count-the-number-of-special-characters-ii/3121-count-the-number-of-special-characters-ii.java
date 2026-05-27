class Solution {
    public int numberOfSpecialChars(String word) {
        int arr1[] = new int[125];
        int arr2[] = new int[125];
        int count =0;
        for(int i=0;i < word.length();i++){
            char c = word.charAt(i);
            arr1[(int)c]++;
            arr2[(int)c] = i;
        }
        for(int i=65;i <= 90;i++){
            char f = (char)(i);
            char l = (char)(i+32);
            if((arr1[i] > 0 && arr1[i+32] > 0) && (arr2[i] > arr2[i+32]) && (word.lastIndexOf(l) < word.indexOf(f))){
                count++;
            }
        }
        return count ;
    }
}