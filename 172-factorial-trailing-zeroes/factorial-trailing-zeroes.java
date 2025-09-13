// class Solution {
//     public int trailingZeroes(int n) {
//         if(n==0){
//             return 0;
//         }
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         int count=0;
//         while(fact%10==0){
//             count++;
//             fact=fact/10;
//         }
//         return count;
//     }
// }

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
