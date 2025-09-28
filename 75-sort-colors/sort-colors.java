class Solution {
    public void sortColors(int[] nums) {
        //This is bubble sort algorithm which is not the optimal solution for this question
        // boolean swapped;
        // for(int i=0;i<nums.length;i++){
        //     swapped=false;
        //     for(int j=1;j<nums.length-i;j++){
        //         if(nums[j]<nums[j-1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j-1];
        //             nums[j-1]=temp;
        //             swapped=true;
        //         }
        //     }
        //     if(!swapped){
        //         break;
        //     }
        // }

        //Dutch National Flag Algorithm

        int start=0;
        int middle=0;
        int end=nums.length-1;
        while(middle<=end){
            if(nums[middle]==0){
                int temp=nums[middle];
                nums[middle]=nums[start];
                nums[start]=temp;
                middle++;
                start++;
            }
            else if(nums[middle]==1){
                middle++;
            }
            else if(nums[middle]==2){
                int temp =nums[middle];
                nums[middle]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
    }
}