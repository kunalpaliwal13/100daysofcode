class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i< strs[0].length(); i++){
            int count=0;
            char ch='0';
            for( int j=0; j<strs.length; j++){
                
                if(i>=strs[j].length() || strs[j].charAt(i)!=strs[0].charAt(i)){return sb.toString();}
                ch=strs[j].charAt(i);
                if(ch !=strs[0].charAt(i)){count =1;break;}
        
            }
            if(count ==0){sb.append(Character.toString(ch));}
            
        } 

        return sb.toString();
    }
}
