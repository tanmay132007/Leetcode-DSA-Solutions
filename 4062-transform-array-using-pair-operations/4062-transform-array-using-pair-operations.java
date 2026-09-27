class Solution {
    public boolean canTransform(int[] s, int[] t) {
        if (s.length != t.length) return false ; 

        long ss = 0 ;
        long st = 0 ;
         for (int i = 0 ; i < s.length; i++){
            ss+=s[i];
            st+=t[i];
        }
        return st == ss ;
        
        
        
    }
}