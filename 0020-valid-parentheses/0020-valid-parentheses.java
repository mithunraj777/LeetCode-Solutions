class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==')'){
                    char p = st.pop();
                    if(p!='('){
                        return false;
                    }
                }
                else if(s.charAt(i)==']'){
                    char p = st.pop();
                    if(p!='['){
                        return false;
                    }
                }
                else if(s.charAt(i)=='}'){
                    char p = st.pop();
                    if(p!='{'){
                        return  false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}