class Solution {
    public int reverse(int x) {
        // int y=Math.abs(x);
        int reverse=0;
        while(x!=0){
            int temp=x%10;
            x/=10;
        if (reverse>Integer.MAX_VALUE/10||reverse<Integer.MIN_VALUE/10){
            return 0;
        }
        
            reverse=(10*reverse)+temp;
            
        }
        return (x<0?-reverse:reverse);
    }
}