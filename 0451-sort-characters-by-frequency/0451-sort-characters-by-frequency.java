class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i < s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c) +1);
            }
            else{
                map.put(c,1);
            }
        }
        Deque<Character> d = new ArrayDeque<>();
        Deque<Character> h = new ArrayDeque<>();
        for(Character x:map.keySet()){
            if(d.isEmpty()){
                d.push(x);
            }
            else{
                while(!(d.isEmpty()) && map.get(d.peek()) >map.get(x)){
                    h.push(d.pop());
                }
                d.push(x);
                while(!(h.isEmpty())){
                    d.push(h.pop());
                }
            }
        }
        while(!(d.isEmpty())){
            char c= d.pop();
            for(int i=0;i < map.get(c);i++){
                sb.append(c+"");
                System.out.println(c);
            }
        }
        return sb.toString();
    }
}