class Solution {
    public int maximumDifference(int[] nums) {
        int profit=0;int low=nums[0];
       for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        int finall=temp-low;
          profit=Math.max(finall,profit);
          low=Math.min(temp,low);
       } 
       if(profit<=0){
        return -1;
       }
       return profit;
    }
}