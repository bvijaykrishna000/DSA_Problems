class Solution {
    public String decodeString(String s) {
        Deque<Integer> num = new ArrayDeque<>();
        Deque<StringBuilder> st = new ArrayDeque<>();
        for(int i=0;i < s.length();i++){
            char c = s.charAt(i);
            int a = 0;
            StringBuilder t = new StringBuilder();
            if(Character.isDigit(c)){
                while(i < s.length() && s.charAt(i) != '['){
                    a = a*10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                num.push(a);
            }
            else if(c == ']'){
                while(!(st.peek().toString().equals("["))){
                    t.insert(0,st.pop()+"");
                }
                st.pop();
                String temp = t.toString();
                int f = num.pop();
                for(int j=0;j < f-1;j++){
                    t.insert(0,temp);
                }
                st.push(t);
            }
            else{
                t = t.append(c+"");
                st.push(t);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!(st.isEmpty())){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}