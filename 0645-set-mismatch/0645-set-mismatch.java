class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> san=new HashSet<>();
        int duplicate=0;int t=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(!san.contains(temp)){
                san.add(temp);
            }
            else{
                duplicate=temp;
            }
        }
        for(int i=1;i<=nums.length;i++){

            if(!san.contains(i)){
                  t=i;
            }
        }
        int[] ans={duplicate,t};
        return ans;
    }
}