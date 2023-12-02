class Solution {
    public int countCharacters(String[] words, String chars) {
        char[] charray= chars.toCharArray();
        Arrays.sort(charray);
        Stack<Character> st= new Stack<>();
        for(int j=charray.length-1; j>=0 ;j-- ){
            st.push(charray[j]);
        }
        int count=0;
        
        //solving
        for( int i =0; i< words.length; i++){
            Stack<Character> stack = (Stack<Character>) st.clone();
            boolean check= false;
            char[] temp = words[i].toCharArray();
            Arrays.sort(temp);
            
            

            int j=0;
            while(!stack.isEmpty()){
                if(temp[j]== stack.pop()){
                    j++;
                    if(j==temp.length){check = true; break;}

                }
            }
            if(check==true){count+=temp.length;}



        } 


        return count;
        
    }
}
