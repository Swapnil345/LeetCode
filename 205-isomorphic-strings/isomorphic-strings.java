class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // HashMap<Character,Integer> map1=new HashMap<>();
        // HashMap<Character,Integer> map2=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     int temp=map1.getOrDefault(s.charAt(i),0);
        //     map1.put(s.charAt(i),temp+1);
        //     temp=map2.getOrDefault(t.charAt(i),0);
        //     map2.put(t.charAt(i),temp+1);
        // }
        // // for(int i=0;i<t.length();i++){
        // //     int temp=map.getOtDefault(t.charAt(i),0);
        // //     map.put(t.charAt(i),temp+1);
        // // }
        // for(int i=0;i<s.length();i++){
        //     if(map1.get(s.charAt(i))!=map2.get(t.charAt(i))){
        //         return false;
        //     }
        // }
        // return true;

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement))
                {map.put(original,replacement);}
            
            else{
                return false;
            }
            }
            else{
                char mappedCharacter=map.get(original);
                if(mappedCharacter!=replacement){
                    return false;
                }
            }
        }
        return true;
    }
}