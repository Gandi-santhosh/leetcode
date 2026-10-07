class Solution {
    public int[] findErrorNums(int[] nums) {
       int n=nums.length;
       HashSet<Integer> san=new HashSet<>();
       //HashSet<Integer> kus=new HashSet<>();
       int duplicate=-1;
       for(int i=0;i<n;i++){
        if(!san.contains(nums[i])){
            san.add(nums[i]);
        }
        else{
            duplicate=nums[i];
        }
       }
       int missing=-1;
       for(int i=1;i<=n;i++){
        //int temp=nums[i];
        if(!san.contains(i)){
            missing=i;
        }
       }
       int[] kus={duplicate,missing};
       return kus;

    }
}