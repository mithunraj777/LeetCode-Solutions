class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        for(int i = 0;i<s.length();i++){
            char c1 = s.charAt(l);
            char c2 = s.charAt(r);
            if(!Character.isLetterOrDigit(c1)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                r--;
                continue;
            }
            if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}