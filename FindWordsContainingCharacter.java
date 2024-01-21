class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int len = words.length;
        List<Integer> list = new ArrayList<>();
        for( int i=0; i< len; i++){
            String currentWord = words[i];
            for( int ii=0; ii< currentWord.length(); ii++){
                if(currentWord.charAt(ii) == x){list.add(i); break;}
            }
        }
        return list;

    }
}
