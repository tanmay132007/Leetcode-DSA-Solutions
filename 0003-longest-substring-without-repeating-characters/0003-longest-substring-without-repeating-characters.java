class Solution {
    public int lengthOfLongestSubstring(String s) {
        String p = "";
        int max = 0 ;
        for (int i= 0 ; i< s.length() ; i++ ){
            char ch = s.charAt(i);
            while (p.indexOf(ch) != -1 ){
                p = p.substring(1);
            }
            p += ch;
            max = Math.max(max , p.length() );
        }
        return max ;
    }
        
}