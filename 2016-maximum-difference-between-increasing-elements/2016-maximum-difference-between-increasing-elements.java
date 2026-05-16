class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int b=nums[j];
                if(b>a){
                    int temp=b-a;
                    max=Math.max(max,temp);
                }
                
            }
        }
        return max;
    }
}