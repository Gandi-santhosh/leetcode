class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int temp=-1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            int val=nums[i];
            if(min<val){
                temp=Math.max(temp,val-min);
            }
            min=Math.min(min,val);
        }
        return temp;
    }
}