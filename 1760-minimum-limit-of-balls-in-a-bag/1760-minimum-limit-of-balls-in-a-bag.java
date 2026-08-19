class Solution {
    public boolean isPossible(int[] nums, int maxOperations,int penalty){
          for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int temp=val/penalty;
            if(val%penalty!=0){
                temp++;
            }
            temp--;
            maxOperations-=temp;
            if(maxOperations<0){
                return false;
            }
          }
         return true;
    } 
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;int r=(int)Math.pow(10,9);
        while(l<=r){
            int penalty=l+(r-l)/2;
            if(isPossible(nums,maxOperations,penalty)){
                r=penalty-1;
            }
            else{
                l=penalty+1;
            }
        }
        return l;
    }

}