class Solution {
    public int minimumDifference(int[] nums, int k) {
        int temp=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l=0;
        for(int i=0;i<nums.length;i++){
             
             if(i-l==k){
                l++;
             }
             if(i-l+1==k){
                int ans=nums[i]-nums[l];
                temp=Math.min(temp,ans);
             }
             
        }
        return temp;
    }
}