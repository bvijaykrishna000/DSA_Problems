class Solution {
    public int calculate(String s) {
        Deque<String> d = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }

        s = sb.toString();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '*'){
                int a = Integer.parseInt(d.pop());

                StringBuilder num = new StringBuilder();
                i++;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num.append(s.charAt(i));
                    i++;
                }

                int b = Integer.parseInt(num.toString());

                d.push(String.valueOf(a * b));
                i--;
            }
            else if(c == '/'){
                int a = Integer.parseInt(d.pop());

                StringBuilder num = new StringBuilder();
                i++;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num.append(s.charAt(i));
                    i++;
                }

                int b = Integer.parseInt(num.toString());

                d.push(String.valueOf(a / b));
                i--;
            }
            else if(Character.isDigit(c)){
                StringBuilder num = new StringBuilder();

                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num.append(s.charAt(i));
                    i++;
                }

                d.push(num.toString());
                i--;
            }
            else{
                d.push(String.valueOf(c));
            }
        }

        if(d.size() == 1){
            return Integer.parseInt(d.pop());
        }

        List<String> arr = new ArrayList<>();

        while(!d.isEmpty()){
            arr.add(d.pop());
        }

        int res = Integer.parseInt(arr.get(arr.size() - 1));

        for(int i = arr.size() - 2; i >= 1; i -= 2){
            String op = arr.get(i);
            int num = Integer.parseInt(arr.get(i - 1));

            if(op.equals("+")){
                res += num;
            }
            else{
                res -= num;
            }
        }

        return res;
    }
}