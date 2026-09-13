class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2] ;
        int c = 0 ;
        for(int i = 0 ; i< nums.length ; i++) {
            for (int j = 0 ;  j< nums.length ; j++) {
                if(i!=j && c<1 && target== nums[i] + nums[j]) { 
                    index[c++] = i  ;
                    index[c++] = j ;
                }
            }
        }
        return index ;
    }
}
