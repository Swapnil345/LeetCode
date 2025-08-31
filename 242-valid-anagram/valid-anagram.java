class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        // char[] ch=s.toCharArray();
        // char[] sh=t.toCharArray();
        // Arrays.sort(ch);
        // Arrays.sort(sh);
        // for(int i=0;i<ch.length;i++){
        //     if(ch[i]!=sh[i]){
        //         return false;
        //     }
        // }
        // return true;


            if(s.length()!=t.length()){
                return false;
            }
            char[] first = s.toCharArray();
            char[] second = t.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            for(int i=0;i<first.length;i++){
                if(first[i]!=second[i]){
                    return false;
                }
            }
            return true;
    }
}