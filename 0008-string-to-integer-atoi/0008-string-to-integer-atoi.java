class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        System.out.println(s);

        long res = 0;
        char sign = 'a';
        int ver = 0;

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(Character.isDigit(c)){

                int digit = c - '0';

                if(sign != '-'){
                    if(res > (Integer.MAX_VALUE - digit) / 10){
                        return Integer.MAX_VALUE;
                    }
                }
                else{
                    if(res > (-(long)Integer.MIN_VALUE - digit) / 10){
                        return Integer.MIN_VALUE;
                    }
                }

                res = res * 10 + digit;
                ver = 1;
            }

            else if(ver == 0 && (c == '-' || c == '+')){
                sign = c;
                ver = 1;
            }

            else{
                break;
            }
        }

        System.out.println(res);

        if(sign == '-'){
            res = -1 * res;
        }

        return (int)res;
    }
}