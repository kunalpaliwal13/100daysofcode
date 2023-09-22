class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(t.length()<s.length()){return false;}
        if(s.length()==0 || t.length()==0){return true;}

        while(true){
            if(s.charAt(i)==t.charAt(j)){i++; j++;}
            else{j++;}
            if(i==s.length()){return true;}
            if(j== t.length()){return false;}

        }
    
    }

}
