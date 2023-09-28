class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb = new StringBuilder(index+1);
        String sub = word.substring(0, index+1);
        for( int i=0; i< index+1; i++){
            sb.append(sub.charAt(i));
        }
        sb.reverse();
        String res = sb.toString()+ word.substring(index+1);
        return res;
    }
    
}
