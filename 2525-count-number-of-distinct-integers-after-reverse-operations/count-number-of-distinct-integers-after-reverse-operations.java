class Solution {
    public int countDistinctIntegers(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
        set.add(reverse(nums[i]));
       }
       return set.size();
    }
    public int reverse(int x){
        int reverse=0;
        while(x!=0){
            int temp=x%10;
            reverse=(10*reverse)+temp;
            x/=10;
        }
        return reverse;
    }
}
//  int n=nums.length;
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//         list.add(nums[i]);
//     }
//         for(int i=0;i<n;i++){
//             list.add(reverse(list.get(i)));
//         }
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<list.size();i++){
//             int temp=map.getOrDefault(list.get(i),0);
//             map.put(list.get(i),temp+1);
//         }
//         int count =0;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() >= 1) {
//                  count++; 
//             }

//         }
//         return count;