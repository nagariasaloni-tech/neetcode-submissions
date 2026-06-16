class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String str:strs){
            char[] strCharList = str.toCharArray();
            Arrays.sort(strCharList);
            String strChar= new String(strCharList);
            if(anagramMap.containsKey(strChar)){
                List<String> anagramList = anagramMap.get(strChar);
                anagramList.add(str);
                anagramMap.put(strChar,anagramList);
            }
            else
                anagramMap.put(strChar, new ArrayList<>(Arrays.asList(str)));
        }

        return new ArrayList<>(anagramMap.values());
    }
}
