class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char arr[];
        HashMap<String , List<String> > map = new HashMap<>();
        for(int i=0;i < strs.length;i++){
            arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(strs[i]);
        }
        return new ArrayList<>(map.values());
     }
}