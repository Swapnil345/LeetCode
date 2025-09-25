// class Solution {
//     public int maxArea(int[] height) {
//         int maxWater=0;
//         int water=0;
//         for(int i=0;i<height.length-1;i++){
//             int j=i+1;
//             while(j<=height.length-1){
//                 if(height[i]<height[j]){
//                     if(water<height[i]*(j-i)){
//                         water=height[i]*(j-i);
//                     }
//                 }
//                 else{
//                     if(water<height[j]*(j-i)){
//                         water=height[j]*(j-i);
//                     }
//                 }
//                 maxWater=Math.max(maxWater,water);
//                 j++;
//             }
//         }
//         return maxWater;
//     }
// }
class Solution {
    public int maxArea(int[] height) {
        // int left = 0, right = height.length - 1;
        // int maxWater = 0;
        
        // while (left < right) {
        //     int width = right - left;
        //     int water = Math.min(height[left], height[right]) * width;
        //     maxWater = Math.max(maxWater, water);

        //     // Move the pointer with the smaller height
        //     if (height[left] < height[right]) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        
        // return maxWater;

        int maxWater=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                int water=height[left]*(right-left);
                maxWater=Math.max(maxWater,water);
                left++;
            }
            else{
                int water=height[right]*(right-left);
                maxWater=Math.max(maxWater,water);
                right--;
            }
        }
        return maxWater;
    }
}
