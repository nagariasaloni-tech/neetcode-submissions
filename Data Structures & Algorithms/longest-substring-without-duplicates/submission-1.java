class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0,maxLength=0;
        Set<Character> charSet = new HashSet<>();
        

        for(int right =0;right<s.length();right++){

            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            System.out.println(right+" "+left+" "+(right-left+1));
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }

        return maxLength;
    }
}
