class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length()-1;
        for(int i=len; i>= 0; i--){
            char c = s.charAt(i);
            sb.deleteCharAt(len);
            sb.insert(0,c);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}
