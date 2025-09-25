// class Solution {
//     public int hammingWeight(int n) {
//         int bin=0;
//         while(n>0){
//             int temp=n%2;
//             bin=(10*bin)+temp;
//             n=n/2;
//         }
//         int count=0;
//         while(bin>0){
//             int temp=bin%10;
//             if(temp==1){
//                 count++;
//             }
//             bin=bin/10;
//         }
//         return count;
//     }
// }

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }
}