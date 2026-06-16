class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String str1 = new String(ch);

            if(map.containsKey(str1))
            {
                List<String> list = map.get(str1);
                list.add(str);
                map.put(str1,list);
            }
            else    
                map.put(str1,new ArrayList<>(Arrays.asList(str)));
        }
        return new ArrayList<>(map.values());
    }
}
