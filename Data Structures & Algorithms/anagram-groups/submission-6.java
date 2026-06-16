class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();

        for(String string:strs){
            String key = getKey(string);

           anagramMap.computeIfAbsent(key,k-> new ArrayList<>()).add(string);
            
            
        }

        return new ArrayList<>(anagramMap.values());
    }

    public String getKey(String value){
       StringBuilder result = new StringBuilder();

        int[] freq = new int[26];

        for(char c:value.toCharArray()){
            freq[c-'a']++;
        }
        for(int c:freq){
            result.append(c).append("#");
        }

        return result.toString();
    }
}
