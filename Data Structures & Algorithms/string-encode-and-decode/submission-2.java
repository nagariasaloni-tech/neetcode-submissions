class Solution {

        public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(String str:strs)
        {
            result.append(str.length());
            result.append("#");
            result.append(str);
        }
        return result.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder decodeString = new StringBuilder();
            while(arr[i] != '#')
            {
                decodeString.append(arr[i++]);
            }
            i++;

            int numberOfChar = Integer.valueOf(decodeString.toString());
            int end = i+numberOfChar;
            decodeString = new StringBuilder();
            while(i<end){
                decodeString.append(arr[i]);
                i++;
            }
            i--;
            result.add(decodeString.toString());


        }

        return result;
    }
}
