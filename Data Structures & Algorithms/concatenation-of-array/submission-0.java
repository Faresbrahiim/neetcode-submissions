class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = new int[nums.length * 2];
        // System.out.println(concat.length);

        int c=0 ;
        for(int i = 0 ; i<concat.length ; i++){
            if(c!=nums.length ) {
                concat[i]=nums[c++];
                System.out.println(c);   
            } else if(c== nums.length ) {
                // System.out.println("checked");
                c=0 ;
                i--;
            }
        }
        return concat; 
    }
}