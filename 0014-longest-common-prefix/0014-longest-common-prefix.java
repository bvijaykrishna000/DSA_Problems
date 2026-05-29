class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder r= new StringBuilder();
        int length = 300;
        for(String s:strs){
            if(s.length() < length){
                length = s.length();
            }
        }
        for(int i=0;i < length;i++){
            String k = strs[0];
            char c = k.charAt(i);
            for(String temp:strs){
                if(c!= temp.charAt(i)){
                    return r.toString();
                }
            }
            r.append(c);
        }
        return r.toString();
    }
}