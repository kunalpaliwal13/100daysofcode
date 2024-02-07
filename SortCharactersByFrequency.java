class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }
            else{
                hm.put(c, 1);
            }
        }
        int max =0;
        HashMap<Character, Integer> arr = new HashMap<>();
        for( int i=0; i< hm.size(); i++){
            max =0;
            Character c = 'a';
            for(Character key: hm.keySet()){
                if(arr.containsKey(key)){continue;}
                if(hm.get(key)>max){c = key; max = hm.get(key);}
            }
            arr.put(c, 1);
            for( int j =0; j< hm.get(c); j++){
                sb.append(c);
            }

        }
        
        return sb.toString();
    }
}
