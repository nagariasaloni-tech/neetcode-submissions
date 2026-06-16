class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^0-9a-zA-z]","");
        s1 = s1.toLowerCase();
        int n = s1.length();
        
        for(int i =0; i<n/2;i++)
        {
            if(s1.charAt(i)!=s1.charAt(n-i-1))
                return false;
        }

        return true;
    }
}
