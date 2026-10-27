class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c=0;int d=0;
        for(int i=0;i<nums.length-1;i++){
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    c=i;d=j;
                }
            }
        }
        int[] k={c,d};
        return k;
        
    }
}