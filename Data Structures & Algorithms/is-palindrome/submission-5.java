class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^0-9a-zA-Z]","");
       s = s.toLowerCase();
       for(int i=0;i<s.length()/2;i++){
        //System.out.println(s.charAt(i)+" "+s.charAt(s.length()-1-i));
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
       }
       return true;
    }
}
