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

        int cur =0;

        while(cur<str.length())
        {
            int pos = cur;
            while(str.charAt(pos) != '#')
                pos++;
            int length = Integer.valueOf(str.substring(cur,pos));
            cur = pos+1;
            pos = cur+length;
            result.add(str.substring(cur,pos));
            cur = pos;
        }

        return result;
    }
}
