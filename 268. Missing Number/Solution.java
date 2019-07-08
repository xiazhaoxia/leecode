class Solution {
    public int missingNumber(int[] nums) {
        //arr include 1-n
        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res^=i;
            res^=nums[i];
        }
        return res;
    }
}