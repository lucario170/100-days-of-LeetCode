class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null)
        return false;
        if(s.length()!=t.length())
            return false;
        return getHashedValue(s).equalsIgnoreCase(getHashedValue(t));
    }

    private String getHashedValue(String word){
        StringBuilder hv = new StringBuilder();
        int letterCount=0;
        HashMap<Character,Integer> letterValueMap = new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(letterValueMap.containsKey(word.charAt(i))){
                hv.append(letterValueMap.get(word.charAt(i)));
            }else{
                letterCount++;
                letterValueMap.put(word.charAt(i),letterCount);
                hv.append(letterCount);
            }
        }
        return hv.toString();
    }
}