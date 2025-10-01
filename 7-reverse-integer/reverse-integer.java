class Solution {
    public int reverse(int x) {
        // int y=Math.abs(x);
        int reverse=0;
        while(x!=0){
            int temp=x%10;
            x/=10;
            // Check overflow for positive numbers
        if (reverse>Integer.MAX_VALUE/10||(reverse==Integer.MAX_VALUE/10&&temp>7)){
            return 0;
        }
        // Check overflow for negative numbers
        if (reverse<Integer.MIN_VALUE/10||(reverse==Integer.MIN_VALUE/10&&temp<-8)){
            return 0;
        }
            reverse=(10*reverse)+temp;
            
        }
        return (x<0?-reverse:reverse);
    }
}