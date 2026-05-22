class Solution {
    public boolean isPalindrome(String s) {
       String s1 = "";
       for(int i=0;i < s.length();i++){
        char c = s.charAt(i);
        if(!(Character.isLetterOrDigit(c))){
            continue;
        }
        else{
            s1 = s1 + c;
        }
       } 
       s1 = s1.toLowerCase();
       int k= 0;
       int j = s1.length() - 1;
       while(k < j){
        if(s1.charAt(k) != s1.charAt(j)){
            return false;
        }
        k++;
        j--;
       }
       return true;
    }
}