class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        char[] s1count = new char[26];
        char[] s2count = new char[26];
        int match =0;

        for(int i=0; i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }

        for(int i=0; i<26;i++){
            if(s1count[i] == s2count[i])
                match++;
        }
        int l=0;
        for(int r= s1.length();r<s2.length();r++){
            if(match == 26)
                return true;
            
            int index = s2.charAt(r)-'a';
            s2count[index]++;

            if(s1count[index] == s2count[index])
                match++;
            else if(s1count[index]+1 == s2count[index])
                match--;
            
            index = s2.charAt(l)-'a';
            s2count[index]--;
            if(s1count[index] == s2count[index])
                match++;
            else if(s1count[index]-1 == s2count[index])
                match--;
            l++;
        }
        return match == 26;
    }
}
