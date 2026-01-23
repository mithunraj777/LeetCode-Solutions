import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        if(ls!=lt){
            return false;
        }
        else{
            int[] count = new int[26];
            int[] count1 = new int[26];
            for(int i=0;i<ls;i++){
                char s1 = s.charAt(i);
                char s2 = t.charAt(i);
                int a = s1;
                int b = s2;
                int c = a-97;
                int d = b-97;
                count[c]+=1;
                count1[d]+=1;
            }
            if (Arrays.equals(count, count1)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}