class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r = 0;
        int y = x;
        while(y!=0){
            int n = (y%10);
            y = y/10;
            r = r*10+n;
        }
        return x==r;
    }
}