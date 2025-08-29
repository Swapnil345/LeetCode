class Solution {
    public long flowerGame(int n, int m) {
        // long count =0;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(Math.abs(i-j)%2!=0){
        //             count++;
        //         }
        //     }
        // }
        // return count;


        long a = (n + 1) / 2; // odds in [1, n]
        long b = n / 2;       // evens in [1, n]
        long c = (m + 1) / 2; // odds in [1, m]
        long d = m / 2;       // evens in [1, m]
        return a * d + b * c;
    }
}