class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);

        for (int i = 0; i < s2.length() - s1.length()+1; i++) {
            System.out.println(i);
            char[] subStrArr = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(subStrArr);
            String sortedSubStr = new String(subStrArr);
            System.out.println(sortedS1+" "+sortedSubStr);
            if (sortedSubStr.equals(sortedS1))
                return true;
        }
        return false;
    }
}
