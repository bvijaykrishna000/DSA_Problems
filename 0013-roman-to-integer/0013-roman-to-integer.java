class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int pre = 0;
        int sum =0;
        for(int i = s.length()-1;i >=0;i--){
            char c = s.charAt(i);
            if(pre > map.get(c)){
                sum -= map.get(c);
            }
            else{
                sum = sum + map.get(c);
            }
            pre = map.get(c);
        }
        return sum;
    }
}