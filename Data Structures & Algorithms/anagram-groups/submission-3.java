class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String str:strs){
            char[] strCharList = str.toCharArray();
            String key = getKey(strCharList);
            //System.out.println(key);
            if(anagramMap.containsKey(key)){
                List<String> anagramList = anagramMap.get(key);
                anagramList.add(str);
                anagramMap.put(key,anagramList);
            }
            else{
                anagramMap.put(key, new ArrayList<>(Arrays.asList(str)));
            }
        }

        return new ArrayList<>(anagramMap.values());
    }

    private String getKey(char[] strCharList){
        String delimeter ="";
        StringBuilder key = new StringBuilder();
        int[] freq = new int[26];
        for(int i=0;i<strCharList.length;i++)
        {
            freq[strCharList[i]-'a']++;
        }
        for(int i=0;i<26;i++)
        {
                key.append(freq[i]);
                key.append("#");
        }
        return key.toString();
    }
}
