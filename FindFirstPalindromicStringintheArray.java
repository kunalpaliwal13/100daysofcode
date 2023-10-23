class Solution {
    public static boolean palindrome(String s){
       StringBuilder sb = new StringBuilder(s);
       String straight = sb.toString();
        String reversed = sb.reverse().toString();
        if(reversed.equals(straight)){return true;}
        return false;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0; i< words.length; i++){
            if(palindrome(words[i])==true){return words[i];}
        }
        return "";
        
    }
}
