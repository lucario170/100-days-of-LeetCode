class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        int matchesFound=0;
        for(int i=0;i<s.length();i++){
            for(;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    matchesFound++;
                    j++;
                   break;
                }
            }
        }
        return matchesFound==s.length();
    }
}